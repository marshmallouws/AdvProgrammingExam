package textui;

/**
 * @author Annika
 */
public interface ITextIO {
    public int getInteger(int min, int max);
    public String getString();
    public boolean getYesOrNo();
    public int select();
}
