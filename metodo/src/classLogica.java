
import java.util.ArrayList;

public class classLogica {

    ArrayList<Punto> datos;

    public classLogica(ArrayList<Punto> datos) {
        this.datos = datos;
    }

    public String getLagrange() {
        String lag = "";
        String polinomio = "";
        for (int i = 0; i < this.datos.size(); i++) {   
            lag = "\n[";
            for (int j = 0; j < this.datos.size(); j++) {
                if (j != i) {
                    lag += ("{");
                    lag += "(x- " + this.datos.get(j).getX() + ") / ";
                    lag += "(" + String.valueOf(this.datos.get(i).getX()) + " - " + String.valueOf(this.datos.get(j).getX() + ")");
                    lag += ("}");
                }
            }
            polinomio += lag + "]*" + String.valueOf(this.datos.get(i).getY());            
        }
        return polinomio;
    }
}
