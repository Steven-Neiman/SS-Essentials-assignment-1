// A class for part 1 of assignment 1 of Smoothstack Essentials.
// Produces four triangles made of asterisks, each with a size determined by an argument

public class AsteriskPyramid{
    public void leftGrowing(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
    public void leftShrinking(int size){
        for(int i=size; i>0; i--){
            for(int j=0; j<i-1; j++){
                System.out.print('*');
            }
            System.out.println('*');
        }
    }
    public void centeredGrowing(int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i; j++){
                System.out.print(' ');
            }
            for(int j=0; j<i; j++){
                System.out.print("**");
            }
            System.out.println('*');
        }
    }
    public void centeredShrinking(int size){
        for(int i=size-1; i>=0; i--){
            for(int j=0; j<size-i; j++){
                System.out.print(' ');
            }
            for(int j=0; j<i; j++){
                System.out.print("**");
            }
            System.out.println('*');
        }
    }
}