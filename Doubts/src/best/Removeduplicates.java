package best;
public class Removeduplicates {
static int temp,j=0;
public static void main(String[] args) {
int a[] = new int []{1,2,4,2,8,1,3};//do insertion sort
int b[] = new int [a.length];
for(int i=0;i<a.length;i++){
 for(int j=i;j<a.length;j++){
   if(a[i]>a[j]){
	temp=a[j];
	a[j]=a[i];
	a[i]=temp;
   } } }
for(int i=0;i<a.length-1;i++){System.out.print(i);
if(a[i]!=a[i+1]){
 b[j]=a[i];j=++j;
}
if(i<a.length-2){continue;}
else{int x=a[a.length-1];
	b[a.length-1]=x;}
} 

for(int i=0;i<b.length;i++){
System.out.println(b[i]); 
}}}