import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    public MineSweeper() {

    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        int row=0, col=0;
        int rowInput,colInput;
        boolean alive = true;
        boolean IsFinished = false;

        do{
            System.out.println("Satır sayısını giriniz");
            row = sc.nextInt();
            System.out.println("Sütun sayısını giriniz");
            col = sc.nextInt();

            if(row < 2 || col < 2){
                System.out.println("Satır ya da Sütun en az 2 olmalıdır.Lütfen tekrar giriniz!");
            }
        }while(row < 2 || col < 2);

        String[][] arr = new String[row][col];
        String[][] arr2 = new String[row][col];

        int mineNumber = (row * col) / 4;

        fillThem(arr, mineNumber, row, col);
        System.out.println();
        System.out.println();
        System.out.println();
        fillThem(arr2,row, col);

        do{
            System.out.println("Tahmin edeceğiniz satır koordinatını giriniz:");
            rowInput= sc.nextInt();
            System.out.println("Tahmin edeceğiniz sütun koordinatını giriniz:");
            colInput= sc.nextInt();

            if(rowInput < 0 || rowInput > row-1 || colInput < 0 || rowInput > col-1 ){
                System.out.println("Girdiğiniz değerler matrisin dışındadır.Lütfen tekrar giriniz!");
            }

            else if(Objects.equals(arr2[rowInput][colInput], "1")){
                System.out.println("Bu değer daha önce girilmiş.Lütfen tekrar giriniz!");
            }

            else if(Objects.equals(arr2[rowInput][colInput], "*")){
                alive=false;
                System.out.println("Mayına bastınız oyun bitti.");
            }

            else{
                String placeInfo="";
                getPlaceInfo(rowInput,colInput,arr,row,col,placeInfo);
                arr[rowInput][colInput]= String.valueOf(checkOthers(rowInput,colInput,arr,placeInfo,col,row));
                boolean res = IsWin(arr, IsFinished, row,col);

                if(res){
                    System.out.println("Tebrikler oyunu kazandınız!");
                }
            }
        }while(alive && !IsFinished);

    }

    public void fillThem(String[][] arr, int mines, int row, int col){
        for(int i= 0; i < row; i++){
            for(int k=0; k<col; k++){
                arr[i][k]="-";
            }
        }


        Random rand = new Random();

        for(int a=0; a<mines; a++) {
            int randRow;
            int randCol;
            do {
                randRow = rand.nextInt(row);
                randCol = rand.nextInt(col);
            } while (Objects.equals(arr[randRow][randCol], "*"));
            arr[randRow][randCol] ="*";
        }


        for(int i= 0; i < row; i++){
            for(int k=0; k<col; k++){
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }

    public void fillThem(String[][] arr, int row, int col){
        for(int i= 0; i < row; i++){
            for(int k=0; k<col; k++){
                arr[i][k]="-";
            }
        }

        for(int i= 0; i < row; i++){
            for(int k=0; k<col; k++){
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }

    public int checkOthers(int rowInput,int  colInput, String arr[][], String placeInfo, int col, int row){
        int count=0;
        switch(placeInfo){
            case "corner":
                if(colInput == 0 && rowInput == 0){
                    if(Objects.equals(arr[0][1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][0], "*")){
                        count++;
                    }
                    return count;
                }
                if(colInput == col-1 && rowInput == 0){
                    if(Objects.equals(arr[0][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][col-1], "*")){
                        count++;
                    }return count;
                }else if(colInput == col-1 && rowInput == row-1){
                    if(Objects.equals(arr[row-1][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][col-1], "*")){
                        count++;
                    }return count;
                }else if(colInput == 0  && rowInput == row-1){
                    if(Objects.equals(arr[row-2][0], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-1][1], "*")){
                        count++;
                    }return count;
                }

            case "side":
                if(rowInput == 0){
                    if(Objects.equals(arr[0][colInput-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[0][colInput+1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][colInput-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][colInput], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[1][colInput+1], "*")){
                        count++;
                    }return count;
                }else if(colInput == 0){
                    if(Objects.equals(arr[rowInput-1][0], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput+1][0], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput-1][1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput][1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput+1][1], "*")){
                        count++;
                    }return count;
                }else if(rowInput == row-1){
                    if(Objects.equals(arr[row-1][colInput-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-1][colInput+1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][colInput-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][colInput], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[row-2][colInput+1], "*")){
                        count++;
                    }return count;
                }else if(colInput == col-1){
                    if(Objects.equals(arr[rowInput-1][col-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput+1][col-1], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput-1][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput][col-2], "*")){
                        count++;
                    }
                    if(Objects.equals(arr[rowInput+1][col-2], "*")){
                        count++;
                    }
                }return count;
            case "middle":
                if(Objects.equals(arr[rowInput-1][colInput-1], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput-1][colInput], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput-1][colInput+1], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput][colInput+1], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput+1][colInput+1], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput+1][colInput], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput+1][colInput-1], "*")){
                    count++;
                }
                if(Objects.equals(arr[rowInput][colInput-1], "*")){
                    count++;
                }return count;
        }return 0;
    }

    public String getPlaceInfo(int rowInput,int  colInput, String arr[][], int row, int col, String placeInfo){
        if((colInput == 0 && rowInput == 0) ||
                (rowInput == 0 && colInput == col-1) ||
                (rowInput == row-1 && colInput == 0) ||
                (rowInput == row-1 && colInput == col-1)){
            return placeInfo="corner";
        } else if ((colInput == 0 && rowInput > 0 && rowInput < row-1) ||
                (rowInput == 0 && colInput > 0 && colInput < col-1) ||
                (rowInput == row-1 && colInput > 0 && colInput < col-1) ||
                (colInput == col-1 && rowInput < row-1 && rowInput > 0)) {
            return placeInfo="side";
        }else{
            return placeInfo="middle";
        }
    }

    public boolean IsWin(String arr[][], boolean win, int row, int col){
        for(int i=0; i<row; i++){
            for(int a=0; a<col; a++){
                if(Objects.equals(arr[i][a], "-")){
                    return false;
                }
            }
        }return true;
    }
}
