// A class for assignment 1 part 1 of Smoothstack essentials.
// Calls the four methods of the AsteriskPyramid class


public class AsteriskPyramidController {
    public static void main(String[] args){
        AsteriskPyramid asteriskPyramid = new AsteriskPyramid();
        asteriskPyramid.leftGrowing(10);
        asteriskPyramid.leftShrinking(10);
        asteriskPyramid.centeredGrowing(10);
        asteriskPyramid.centeredShrinking(10);
    }
}
