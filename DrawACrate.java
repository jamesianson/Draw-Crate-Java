public class DrawACrate
{
    public static void main(String[] args)
    {
        Rectangle face = new Rectangle (20, 30, 100, 40);
        face.draw();
        Line line1 = new Line (20, 30, 50, 10); //first line
        line1.draw();
        Line line2 = new Line (120, 70, 150, 50); //second line
        line2.draw();
        Line line3 = new Line (120, 30, 150, 10); //third line
        line3.draw();
        Line line4 = new Line (150, 50, 150, 10); //fourth line
        line4.draw();
        Line line5 = new Line (150, 10, 50, 10);//fifth line
        line5.draw();
    }
}
