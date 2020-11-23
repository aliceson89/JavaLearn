public class Tutorial14 {

    public static void main (String arg[]){

        //다차원 배열
        int N = 50;
        int [][] array = new int[N][N];
        for (int i =0 ; i < N ; i++){
            for (int j = 0; j < N ; j++){
                //0~9 = Math.random()*10
                array[i][j] = (int)(Math.random()*10);
            }
        }

        for (int i =0 ; i < N ; i++){
            for (int j = 0; j < N ; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
