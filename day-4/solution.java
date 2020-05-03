import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
class TestClass {
static class FastReader
{BufferedReader br;
StringTokenizer st;
public FastReader()
{
br = new BufferedReader(new
InputStreamReader(System.in));
}

String next()
{
while (st == null || !st.hasMoreElements())
{
try
{
st = new StringTokenizer(br.readLine());
}
catch (IOException e)
{
e.printStackTrace();
}
}
return st.nextToken();
}

int nextInt()
{
return Integer.parseInt(next());
}

long nextLong()
{
return Long.parseLong(next());
}

double nextDouble()
{
return Double.parseDouble(next());
}

String nextLine()
{
String str = "";
try
{
str = br.readLine();
}
catch (IOException e)
{
e.printStackTrace();
}
return str;
}
}
public static void main(String args[] ) throws Exception {
FastReader br=new FastReader();

int t=br.nextInt();
while(t-->0){
int n=br.nextInt();
int a[]=new int[n];
int v[]=new int[n];
for(int i=0;i<n;i++)
a[i]=br.nextInt();
v[0]=1;
Stack<Integer> st=new Stack<Integer>();

for(int i=0;i<n;i++){
while(!st.isEmpty()&&a[st.peek()]<=a[i])
st.pop();
v[i]=st.isEmpty()?i+1:i-st.peek();
st.push(i);
System.out.print(v[i]+" ");
}

System.out.println();
}

}
}
