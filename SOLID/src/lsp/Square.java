package lsp;

public class Square extends Rectangle{
    public void setHeight(double h){
        super.setHeight(h);
        super.setWidth(h);
    }
    public void setWidth(double h){
        super.setHeight(h);
        super.setWidth(h);
    }
}
