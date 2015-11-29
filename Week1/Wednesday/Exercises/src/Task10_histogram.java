
public class Task10_histogram {
	static int[] histogram(short[][] image){
		int[] hits = new int[256];
		
		for(int i = 0 ; i < image.length ; i++){
			for(int j = 0 ; j < image[i].length; j++){
				hits[image[i][j]] += 1;
			}
		}
		
		return hits;
	}
}
