
public class Task16_Rescale {
	static int[][] rescale(int[][] original, int newWidth, int newHeight){
		
		double xRatio = newWidth/(double)original.length;
		double yRatio = newHeight/(double)original[0].length;
		
		int[][] rescaled = new int[newWidth][newHeight];
		
		for(int i = 0 ; i < rescaled.length; i++){
			for(int j = 0 ; j < rescaled[i].length ; j++){
				rescaled[i][j] = original[(int)(i/xRatio)][(int)(j/yRatio)];
			}
		}
		
		return rescaled;
	}
}
