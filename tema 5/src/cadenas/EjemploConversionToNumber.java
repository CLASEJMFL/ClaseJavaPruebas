public class EjemploConversionToNumber {
    public static void main(String[] args) throws Exception {
        String cadenaNumero = "125";

        // 1. Uso de parse (Devuelve un tipo primitivo)
        // Se usa cuando solo necesitas el valor para calculos rapidos
        int primitivo = Integer.parseInt(cadenaNumero);

        // 2. Uso de valueof (Devuelve un objeto de la clase envoltorio)
        // Se usa cuando encesitas trabajar con objetos (ej. en coleccciones)
        Integer objeto = Integer.valueOf(cadenaNumero);

        // Comprobacion
        System.out.println("Suma con primeitivo: "+(primitivo+5));
        System.out.println("Suma con objeto: "+(objeto+5));

        // Un detalle importante: valueof puede aprovechar el integer cache
        Integer otroObjeto = Integer.valueOf("125");
        System.out.println("¿Son el mismo objeto?: "+ (objeto==otroObjeto)); // true (por el cache)
    }
}
