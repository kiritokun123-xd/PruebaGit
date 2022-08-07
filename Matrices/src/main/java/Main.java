public class Main {
    public static void  main(String[] args){
        //Variables

        int matriz[][] = {{1,112,13,444,5},{2,4,16,8,10},{3,6,19,812,15}};

        int mayor[] = new int[3];
        int menor[] = new int[3];

        int may = 0, men = 0;

        //Array de mayores y menores
        for (int i = 0; i < matriz.length; i++){
            mayor[i] = matriz[i][0];
            menor[i] = matriz[i][0];
            for (int j = 0; j < matriz[i].length - 1; j++){
                if (mayor[i] < matriz[i][j+1]){
                    mayor[i] = matriz[i][j+1];
                }
                if(menor[i] > matriz[i][j+1]){
                    menor[i] = matriz[i][j];
                }
            }
        }

        //El mayor y menor de todos
        for (int i = 0; i < mayor.length - 1; i++){
            may = mayor[0];
            men = menor[0];
            if (may < mayor[i+1]) {
                may = mayor[i + 1];
            }
            if(men > mayor[i+1]){
                men = menor[i];
            }
        }
        System.out.println("El número mayor es: " + may);
        System.out.println("El número menor es: " + men);
    }
}
