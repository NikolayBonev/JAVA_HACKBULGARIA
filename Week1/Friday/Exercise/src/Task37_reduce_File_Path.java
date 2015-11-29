
public class Task37_reduce_File_Path {
	
	static String reduce_file_path(String path){
		
		path = path.replaceAll("(?:/[\\w]+)?/\\.\\.", "").replaceAll("(/\\.)", "").replaceAll("([/]+)", "/");
		
		if(path.length() > 1){
			path = path.replaceAll("/$", "");
		}
				
		
		return path;
	}
}