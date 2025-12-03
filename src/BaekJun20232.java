import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaekJun20232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> records = Map.ofEntries(
                Map.entry(1995, "ITMO"),
                Map.entry(1996, "SPbSU"),
                Map.entry(1997, "SPbSU"),
                Map.entry(1998, "ITMO"),
                Map.entry(1999, "ITMO"),
                Map.entry(2000, "SPbSU"),
                Map.entry(2001, "ITMO"),
                Map.entry(2002, "ITMO"),
                Map.entry(2003, "ITMO"),
                Map.entry(2004, "ITMO"),
                Map.entry(2005, "ITMO"),
                Map.entry(2006, "PetrSU, ITMO"),
                Map.entry(2007, "SPbSU"),
                Map.entry(2008, "SPbSU"),
                Map.entry(2009, "ITMO"),
                Map.entry(2010, "ITMO"),
                Map.entry(2011, "ITMO"),
                Map.entry(2012, "ITMO"),
                Map.entry(2013, "SPbSU"),
                Map.entry(2014, "ITMO"),
                Map.entry(2015, "ITMO"),
                Map.entry(2016, "ITMO"),
                Map.entry(2017, "ITMO"),
                Map.entry(2018, "SPbSU"),
                Map.entry(2019, "ITMO")
        );

        int year = sc.nextInt();

        System.out.println(records.get(year));
    }
}
