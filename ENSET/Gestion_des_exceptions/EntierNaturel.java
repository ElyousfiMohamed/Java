package Gestion_des_exceptions;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if(val >= 0)
            this.val = val;
        else 
            throw new NombreNegatifException(val);
    }


    public int getVal() {
        return this.val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val >= 0)
            this.val = val;
        else 
            throw new NombreNegatifException(val);
    }

    public void decrementer() throws NombreNegatifException {
        if(--this.val < 0) {
            throw new NombreNegatifException(this.val++);
        }
    }
}