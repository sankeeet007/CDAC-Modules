class Pattern3{
	public static void main(String args[]){
		int i, j, cnt=1;
		
		for(i=0; i<4; i++){
			for(j=0; j<i+1; j++, cnt++){
				System.out.print(cnt+" ");
			}
			System.out.println();
		}
		
	}
}