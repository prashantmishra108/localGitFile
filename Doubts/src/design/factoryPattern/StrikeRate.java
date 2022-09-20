package design.factoryPattern;

abstract class StrikeRate {
public int srate;
abstract void getRate();
public int runs(int matches){
	return srate*matches;
}
}
