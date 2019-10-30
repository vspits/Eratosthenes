package sieveoferatosthenes;

public class SieveOfEratosthenes 
{ 
    public static void main(String args[]) 
    { 
        int n = 120;  
        SieveOfEratosthenes eratosthenes = new SieveOfEratosthenes(); 
        eratosthenes.sieveOfEratosthenes(n); 
    } 
    
    private static void sieveOfEratosthenes(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        for(int i = 0; i < n; i++) 
            prime[i] = true; 
          
        for(int p = 2; p * p <= n; p++) 
        { 
            if(prime[p]) 
            { 
                for(int i = p * p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i]) 
                System.out.print(i + " "); 
        } 
    } 
}