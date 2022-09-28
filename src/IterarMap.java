import java.util.Map;

public class IterarMap {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(args);
        Map<String,String> map = pb.environment();
        for (String clave:map.keySet()) {
            String valor = map.get(clave);
            System.out.println("Clave: " + clave + ", valor: " + valor);
        }
    }
}
