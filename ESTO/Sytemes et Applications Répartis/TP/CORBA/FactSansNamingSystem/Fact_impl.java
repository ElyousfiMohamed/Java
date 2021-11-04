public class Fact_impl extends factPOA
{
public double calculfact (int N){
	if(N==0)
		return 1;
	else
		return calculfact(N-1)*N;
}  
} // class Fact_impl
