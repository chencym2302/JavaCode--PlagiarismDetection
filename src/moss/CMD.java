package moss;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CMD implements Runnable {

	private InputStream ins = null;
	private static String url;
	public CMD(InputStream instream) {
		this.ins = instream;
	}

	public CMD() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					ins));
			String line = null;
			while ((line = reader.readLine()) != null) {
				
				if(line.startsWith("http://moss.stanford.edu/results/"))
				{
					CMD.url = line;
				}
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Construct the check according language and directory
	 * @param userId
	 * @param language
	 * @param directory/ this directory make the 
	 * @return
	 */
	public String getUrlOfCmd(int userId, String language, String directory) {
		//./moss -u 3 -l java java/*.java
		directory = directory.replaceAll("\\\\", "/");
//		directory = "D:/Code/antiplag-master/antiplag/jfinalTest/WebRoot/upload/file";
		System.out.println("正在调用moss。。。。。。。。。。。。。 \n" + directory );
		String [] cmd = new String[] { "cmd.exe", "/C", "D:\\cygwin64\\bin\\perl.exe moss -u "+userId+" -l "+ language + " " + directory+"/*."+language };
		try {
	            Process process = Runtime.getRuntime().exec(cmd);
	            new Thread(new CMD(process.getInputStream())).start();
	            new Thread(new CMD(process.getErrorStream())).start();
	            process.getOutputStream().close();
	            int exitValue = process.waitFor();
	            process.destroy();
	            System.out.println("return: " + exitValue);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return CMD.url;
	}
	
	/**
	 * get the detail difference from two directory, using recursion
	 * @param userId
	 * @param language
	 * @param directoryA
	 * @param directoryB
	 * @return
	 */
	public String getTwoDirectoryDiff(int userId, String language, String directoryA, String directoryB) {
		String [] cmd = new String[] { "cmd.exe", "/C", "D:\\cygwin\\bin\\perl.exe moss -u "+userId+" -l "+ language + " " + directoryA+"/*."+language};
		 try {
	            Process process = Runtime.getRuntime().exec(cmd);
	            new Thread(new CMD(process.getInputStream())).start();
	            new Thread(new CMD(process.getErrorStream())).start();
	            process.getOutputStream().close();
	            int exitValue = process.waitFor();
	            process.destroy();
	            System.out.println("return: " + exitValue);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return CMD.url;
	}
	
	/**
	 * get the difference using baseFile
	 * @param userId
	 * @param language
	 * @param baseFile
	 * @param directory
	 * @return
	 */
	public String getDiffFromBase(int userId, String language, String baseFile, String directory) {
		String [] cmd = new String[] { "cmd.exe", "/C", "D:\\cygwin\\bin\\perl.exe moss -u "+userId+" -l "+ language + " -b " +baseFile+" "+directory+"/*."+language };
		 try {
	            Process process = Runtime.getRuntime().exec(cmd);
	            new Thread(new CMD(process.getInputStream())).start();
	            new Thread(new CMD(process.getErrorStream())).start();
	            process.getOutputStream().close();
	            int exitValue = process.waitFor();
	            process.destroy();
	            System.out.println("return: " + exitValue);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return CMD.url;
	}
	/**
	 * exec a task using cmd
	 * @author twins
	 * @param task
	 * @return
	 */
	public static boolean cmd(String task) {
		String [] cmd = new String[] { "cmd.exe", "/C", task };
		 try {
	            Process process = Runtime.getRuntime().exec(cmd);
	            //���������߳̽��м���
	            new Thread(new CMD(process.getInputStream())).start();
	            new Thread(new CMD(process.getErrorStream())).start();
	            process.getOutputStream().close();
	            process.destroy();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return false;
	}
	
	/**
	 * if a task is filled cpu, kill it forcely!
	 * @param taskName
	 * @return
	 */
	public static boolean taskKill(String taskName) {
		String [] cmd = new String[] { "cmd.exe", "/C", "taskkill /im " + taskName +" /f" };
		 try {
	            Process process = Runtime.getRuntime().exec(cmd);
	            //���������߳̽��м���
	            new Thread(new CMD(process.getInputStream())).start();
	            new Thread(new CMD(process.getErrorStream())).start();
	            process.getOutputStream().close();
	            process.destroy();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return false;
	}
	
}
