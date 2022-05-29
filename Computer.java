public class Computer {

    private String computerSymbol;
    private Integer computerPosition = null;

    public Computer(String computerSymbol) {
        this.computerSymbol = computerSymbol;
    }

    public String getComputerSymbol() {
        return computerSymbol;
    }

    public Integer getComputerPosition() {
        return computerPosition;
    }

    public void setComputerSymbol(String computerSymbol) {
        this.computerSymbol = computerSymbol;
    }

    public void setComputerPosition(Integer computerPosition) {
        this.computerPosition = computerPosition;
    }
}
