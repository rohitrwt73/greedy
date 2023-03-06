import java.util.*;
public class greedy7 {
    public static void main(String args[]){
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        Arrays.sort(costHor,Collections.reverseOrder());
        Arrays.sort(costVer,Collections.reverseOrder());
        int h=0 ,v=0;
        int hp=1, vp=1 , cost=0;
        while(h<costHor.length && v< costVer.length)
        { //vercost<horcost
            if(costVer[v] <= costHor[h]){ //hori cut
                cost+=( costHor[h] *vp);
                hp++;
                h++;
            }
            else{                       //verti cut
                cost+=( costVer[v] *hp);
                vp++;
                v++;
            }

        }
        while(h<costHor.length){
            cost+=( costHor[h] *vp);
                hp++;
                h++;
        }
        while(v<costVer.length){
            cost+=( costVer[v] *hp);
                vp++;
                v++;
        }
        System.out.println("The min cost of cuts =" + cost);
    }
}
