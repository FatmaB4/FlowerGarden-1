import java.util.Arrays;
import java.util.ArrayList;

public class FlowerGarden
{
	//create an arraylist instance variable
	public ArrayList<String> myFlowerList;

	//write a constructor 

 public FlowerGarden() {
myFlowerList = new ArrayList<>();
}		
	
//write add flower
//  add flowers to the list , if the flower in the list it increases the number
//
 public void addFlower(String flower) {
int checkIntheList = 0;

for (String s : myFlowerList) {
  String[] s1 = s.split(" ");
    if (s1[1].equals(flower)) {
    int count = Integer.parseInt(s1[0]);
    count++;
    myFlowerList.remove(s);//if the flower in the list remove it to update and add the new                        //number
if (count >= 1 && count <= 9) {
myFlowerList.add("0" + count + " " + s1[1]);
}
else
myFlowerList.add(count + " " + s1[1]);
checkIntheList = 1;
}
}
if (checkIntheList == 0) {
myFlowerList.add("01 " + flower);
}
}
	
	//write get count

public int getCount(String flower) {
for (String s : myFlowerList) {
String[] s1 = s.split(" ");
if (s1[1].equals(flower)) {
return Integer.parseInt(s1[0]);
}
}
return 0;
}
		
	//write get flower name

public String getFlowerName(int position) {
String s1 = myFlowerList.get(position);
String[] s = s1.split(" ");
return s[1];
}
	
	//write in range
	
	//write find flower

  public int findFlower(String flower) {
for (String s : myFlowerList) {
String[] s1 = s.split(" ");
if (s1[1].equals(flower)) {
return myFlowerList.indexOf(s);
}
}
return 0;
}

	//write max flower	
public String maxFlower() {
String name;
String s = myFlowerList.get(0);
String[] s1 = s.split(" ");
int max = Integer.parseInt(s1[0]);
name = s1[1];
for (int i = 1; i < myFlowerList.size(); i++) {
String[] s2 = myFlowerList.get(i).split(" ");
if (Integer.parseInt(s2[0]) > max) {
max = Integer.parseInt(s2[0]); name = s2[1];
}
}
if (max >= 1 && max <= 9) {
return "0" + max + " " + name;
}
else
return max + " " + name;
}
  
		//write a toString
  public ArrayList<String> ToString(){
    return myFlowerList;
  }


}