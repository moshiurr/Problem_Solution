import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class MyClass {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, Ver> db = new HashMap<>();
        while (n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String v = st.nextToken();
            Ver nVer;
            if(db.containsKey(v)) nVer = db.get(v);
            else nVer = new Ver(v);
            while(st.hasMoreTokens()){
                String edge = st.nextToken();
                Ver eVer;
                if(db.containsKey(edge)) eVer = db.get(edge);
                else eVer = new Ver(edge);

                nVer.adj.add(eVer);
                eVer.adj.add(nVer);
                db.put(edge,eVer);
            }
            db.put(v,nVer);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        Ver from = db.get(st.nextToken());
        Ver to = db.get(st.nextToken());

        if(from == null || to == null) sb.append("no route found");
        else {
            String ans = dfs(from,to);
            if(ans.equalsIgnoreCase("")) sb.append("no route found");
            else sb.append(ans);
        }


        out.write(sb.toString().getBytes());

        br.close();
        out.close();
    }


    public static String dfs(Ver from, Ver to){
        from.visited = true;
        if(from.name.equalsIgnoreCase(to.name)) return from.name;

        List<Ver> edges = from.adj;
        String ans = "";
        for(Ver edge: edges){
            if(!edge.visited){
                String route = dfs(edge,to);
                if(!route.equalsIgnoreCase("")) return from.name+" "+route;
            }
        }

        return ans;
    }

    static class Ver{
        String name;
        List<Ver> adj;
        boolean visited;
        Ver(String n){
            this.name = n;
            adj = new LinkedList<>();
            visited = false;
        }
        public String toString(){
            return this.name;
        }
    }
}
