import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Punticos {

    public void puntico1() {
        String t1 = "Hola";
        String t2 = "Mundo";
        System.out.println(t1 + " " + t2 + " ");
    }

    public void puntico2() {
        String miNombre = "Dereck";
        System.out.println("Hola " + miNombre);
    }

    public void puntico3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        double n = sc.nextDouble();
        System.out.println("Cuadrado: " + (n * n));
    }

    public void puntico4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Num 1: ");
        double a = sc.nextDouble();
        System.out.print("Num 2: ");
        double b = sc.nextDouble();
        System.out.println("Suma: " + (a + b));
    }

    public void puntico5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N1: ");
        double n1 = sc.nextDouble();
        System.out.print("N2: ");
        double n2 = sc.nextDouble();
        System.out.println("Suma: " + (n1 + n2));
        System.out.println("Resta: " + (n1 - n2));
        System.out.println("Multiplicación: " + (n1 * n2));
        if (n2 != 0) {
            System.out.println("División: " + (n1 / n2));
            System.out.println("Residuo: " + (n1 % n2));
        } else {
            System.out.println("Error: división por cero.");
        }
    }

    public void puntico6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número decimal: ");
        double n = sc.nextDouble();
        int entera = (int) n;
        double decimal = n - entera;
        System.out.println("Parte entera: " + entera);
        System.out.println("Parte decimal: " + decimal);
    }

    public double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
    }

    public void puntico7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 5 notas:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        System.out.println("Nota final ponderada: " + calcularPromedio(n1, n2, n3, n4, n5));
    }

    public double calcularIVA(double precioBruto) {
        return precioBruto * 1.19;
    }

    public void puntico8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio bruto: ");
        double bruto = sc.nextDouble();
        double valorIva = bruto * 0.19;
        double total = calcularIVA(bruto);
        System.out.println("Original: " + bruto + " | IVA (19%): " + valorIva + " | Total: " + total);
    }

    public void puntico9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio: ");
        double r = sc.nextDouble();
        System.out.println("Área: " + (Math.PI * r * r));
        System.out.println("Perímetro: " + (2 * Math.PI * r));
    }

    public void puntico10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado del hexágono: ");
        double l = sc.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * l * l;
        System.out.println("Área calculada: " + area);
    }

    public void puntico11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de números (n): ");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            suma += sc.nextDouble();
        }
        System.out.println("Promedio: " + (n > 0 ? (suma / n) : 0));
    }

    public void puntico12() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenadas punto 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Coordenadas punto 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distancia cartesiana: " + dist);
    }

    public void puntico13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígito n (1-9): ");
        int n = sc.nextInt();
        int nn = Integer.parseInt("" + n + n);
        int nnn = Integer.parseInt("" + n + n + n);
        System.out.println("Valores: " + n + ", " + nn + ", " + nnn);
        System.out.println("Suma total: " + (n + nn + nnn));
    }

    public void puntico14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos totales: ");
        int segs = sc.nextInt();
        int h = segs / 3600;
        int m = (segs % 3600) / 60;
        int s = segs % 60;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }

    public void puntico15() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número entero: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Es par" : "Es impar");
    }

    public void puntico16() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        double n = sc.nextDouble();
        if (n > 0) System.out.println("Es positivo");
        else if (n < 0) System.out.println("Es negativo");
        else System.out.println("Es cero");
    }

    public void puntico17() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio bruto de venta: ");
        double bruto = sc.nextDouble();
        double total = calcularIVA(bruto);
        if (bruto > 150000) {
            total = total * 0.95;
            System.out.println("Aplica descuento 5%. Total con IVA: " + total);
        } else {
            System.out.println("Total con IVA sin descuento: " + total);
        }
    }

    public void puntico18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 5 notas:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        double deif = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("Nota final: " + deif);
        if (deif < 2.0) System.out.println("No puede habilitar.");
        else if (deif < 3.0) System.out.println("Reprobó.");
        else {
            System.out.println("Aprobó.");
            if (deif > 4.5) System.out.println("¡Felicitaciones!");
        }
    }

    public void puntico19() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Parámetros a, b y c de la ecuación: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double x1 = (-b + Math.sqrt(disc)) / (2 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Soluciones: x1 = " + x1 + " , x2 = " + x2);
        } else if (disc == 0) {
            System.out.println("Solución única: x = " + (-b / (2 * a)));
        } else {
            System.out.println("La ecuación tiene raíces complejas.");
        }
    }

    public void puntico20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usr = sc.nextLine();
        System.out.print("Contraseña: ");
        String pass = sc.nextLine();
        if (usr.equals("carlos") && pass.equals("1234")) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }

    public void puntico21() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (0-10): ");
        int n = sc.nextInt();
        String[] textos = {"CERO", "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ"};
        if (n >= 0 && n <= 10) System.out.println(textos[n]);
        else System.out.println("Valor fuera del rango permitido.");
    }

    public void puntico22() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número (< 100.000): ");
        int n = sc.nextInt();
        System.out.println("Cantidad de dígitos: " + String.valueOf(Math.abs(n)).length());
    }

    public void puntico23() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba los 3 números: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if (x < y && y < z) System.out.println("está incrementando");
        else if (x > y && y > z) System.out.println("está disminuyendo");
        else System.out.println("Ni se incrementa ni se disminuyendo");
    }

    public void puntico24() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Día numérico (1-7): ");
        int d = sc.nextInt();
        String[] dias = {"", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        if (d >= 1 && d <= 7) System.out.println(dias[d]);
        else System.out.println("Número inválido.");
    }

    public String invertirTexto(String original) {
        StringBuilder sb = new StringBuilder(original);
        return sb.reverse().toString();
    }

    public void puntico25() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto largo: ");
        String texto = sc.nextLine();
        System.out.println("Texto invertido: " + invertirTexto(texto));
    }

    public void puntico26() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto largo: ");
        String texto = sc.nextLine();
        String[] palabras = texto.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : palabras) {
            if (!p.isEmpty()) {
                sb.append(Character.toUpperCase(p.charAt(0))).append(p.substring(1)).append(" ");
            }
        }
        System.out.println("Resultado: " + sb.toString().trim());
    }
    public void puntico27() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto largo: ");
        String texto = sc.nextLine().trim();
        String[] palabras = texto.split("\s+");
        if (palabras.length >= 2) {
            System.out.println("Penúltima palabra: " + palabras[palabras.length - 2]);
        } else {
            System.out.println("No hay suficientes palabras.");
        }
    }
    public void puntico28() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto 1: ");
        String t1 = sc.nextLine();
        System.out.print("Texto 2: ");
        String t2 = sc.nextLine();
        if (t2.contains(t1)) System.out.println("El segundo contiene al primero.");
        else System.out.println("El segundo NO contiene al primero.");
    }
    public boolean esPalindromo(String palabra) {
        String limpia = palabra.replaceAll("\s+", "").toLowerCase();
        String inv = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(inv);
    }
    public void puntico29() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palabra: ");
        String p = sc.next();
        System.out.println("¿Es palíndromo?: " + esPalindromo(p));
    }
    public void puntico30() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de lados: ");
        int n = sc.nextInt();
        System.out.print("Longitud de lado: ");
        double l = sc.nextDouble();
        double area = (n * l * l) / (4 * Math.tan(Math.PI / n));
        System.out.println("Área del polígono: " + area);
    }
    public void puntico31() {
        for (int i = 1; i <= 10; i++) System.out.print(i + " ");
        System.out.println();
    }
    public void puntico32() {
        int cont = 0, num = 1;
        while (cont < 10) {
            System.out.print(num + " ");
            num += 2;
            cont++;
        }
        System.out.println();
    }
    public void puntico33() {
        int cont = 0, num = 2;
        while (cont < 10) {
            System.out.print(num + " ");
            num += 2;
            cont++;
        }
        System.out.println();
    }
    public void puntico34() {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n <= 0) {
            System.out.print("Ingrese número entero positivo: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) System.out.println("Valor no permitido.");
            } else {
                System.out.println("Valor no permitido.");
                sc.next();
            }
        }
        System.out.println("Número válido: " + n);
    }
    public void puntico35() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número decimal: ");
        int n = sc.nextInt();
        System.out.println("Binario: " + Integer.toBinaryString(n));
    }
    public void puntico36() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número binario: ");
        String b = sc.next();
        try {
            System.out.println("Decimal: " + Integer.parseInt(b, 2));
        } catch (NumberFormatException e) {
            System.out.println("Formato binario inválido.");
        }
    }
    public void puntico37() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
    }
    public void puntico38() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int f = sc.nextInt();
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= i; j++) System.out.print("@");
            System.out.println();
        }
    }
    public void puntico39() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int f = sc.nextInt();
        for (int i = f; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
    public void problemaFinal() {
        double[] bultosPrueba = {15, 30, 520, 150, 450, 10, 310, 25, 495, 200, 250, 305, 8, 280, 120};
        int totalBultos = 0;
        double pesoTotal = 0;
        double maxPeso = Double.MIN_VALUE;
        double minPeso = Double.MAX_VALUE;
        double pesosCop = 0;
        System.out.printf("%-8s %-10s %-12s %-12s\n", "Bulto", "Peso(Kg)", "Estado", "Costo(COP)");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < bultosPrueba.length; i++) {
            double p = bultosPrueba[i];
            if (p > 500) {
                System.out.printf("%-8d %-10.1f %-12s %-12s\n", (i + 1), p, "RECHAZADO", "0");
                continue;
            }
            if (pesoTotal + p > 18000) {
                System.out.printf("%-8d %-10.1f %-12s %-12s\n", (i + 1), p, "EXCEDE AVION", "0");
                continue;
            }
            totalBultos++;
            pesoTotal += p;
            if (p > maxPeso) maxPeso = p;
            if (p < minPeso) minPeso = p;
            double costo = 0;
            if (p >= 26 && p <= 300) costo = p * 1500;
            else if (p >= 301 && p <= 500) costo = p * 2500;
            pesosCop += costo;
            System.out.printf("%-8d %-10.1f %-12s %-12.1f\n", totalBultos, p, "ACEPTADO", costo);
        }
        System.out.println("----------------------------------------------");
        System.out.println("a. Total bultos ingresados: " + totalBultos);
        if (totalBultos > 0) {
            System.out.printf("b. Más pesado: %.1f Kg | Más liviano: %.1f Kg\n", maxPeso, minPeso);
            System.out.printf("c. Peso promedio: %.1f Kg\n", (pesoTotal / totalBultos));
        }
        System.out.printf("d. Ingresos en COP: $%.1f\n", pesosCop);
        System.out.printf("   Ingresos en USD: $%.1f (TRM 4000)\n", (pesosCop / 4000.0));
    }
}