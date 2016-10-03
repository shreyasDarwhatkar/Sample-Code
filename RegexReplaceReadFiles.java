import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class RegexReplaceReadFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegexReplaceReadFiles r = new RegexReplaceReadFiles();
		List<String> lstFile = new ArrayList<String>(); 
		Path p = Paths.get("F:\\Shreyas\\Calculator\\Book");
		List<String> fileNames = r.getFileNames(lstFile,p );
		
		
		for(String path : fileNames){
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			String str = new String(data, "UTF-8");
		}
	}
	
	
	private List<String> getFileNames(List<String> fileNames, Path dir) {
	    try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
	        for (Path path : stream) {
	            if(path.toFile().isDirectory()) {
	                getFileNames(fileNames, path);
	            } else {
	                fileNames.add(path.toAbsolutePath().toString());
	                System.out.println(path.getFileName());
	            }
	        }
	    } catch(IOException e) {
	        e.printStackTrace();
	    }
	    return fileNames;
	} 
}
