import java.util.*;
public class LABApp{
static char g;
static double rbc,wbc,hgb,hct,crt,ual,chl,tgd,ldl,hdl,bpc,t3,t4;
public static void getdata(){
Scanner in = new Scanner(System.in);
double[] res = new double[13];
System.out.println("LAB REPORT...");
System.out.println("Male(m)/Female(f)/Children(c): ");
g=in.next().charAt(0);
System.out.println("Red Blood Cells Level(RBC): ");
rbc=in.nextDouble();
System.out.println("White Blood Cells Level(WBC): ");
wbc=in.nextDouble();
System.out.println("Haemoglobin Level(HGB):");
hgb=in.nextDouble();
System.out.println("Hematrocrit(HCT): ");
hct=in.nextDouble();
System.out.println("Creatinine: ");
crt=in.nextDouble();
System.out.println("Uric Acid Level(Serum Urate): ");
ual=in.nextDouble();
System.out.println("Cholestrol: ");
chl=in.nextDouble();
System.out.println("Low-density Lipoprotein(LDL): ");
ldl=in.nextDouble();
System.out.println("High-density Lipoprotein(HDL): ");
hdl=in.nextDouble();
System.out.println("Lipid Profile(Triglycerides): ");
tgd=in.nextDouble();
System.out.println("Blood Platelets Count: ");
bpc=in.nextDouble();
System.out.println("Triiodothyronine(T3): ");
t3=in.nextDouble();
System.out.println("Thyroxine(T4):");
t4=in.nextDouble();}
public static void checkup(){
if(LABApp.g=='m'){
System.out.println();
System.out.println("For Male..");
if(LABApp.rbc!=0){
	if(LABApp.rbc<4.7){
        System.out.println("Dark green leafy vegetables");}
        else if(LABApp.rbc>6.1){
	System.out.println("Avoiding diuretrics(Caffeine)");}
	else{
	System.out.println("");}}
if(LABApp.wbc!=0){
	if(LABApp.wbc<3.8){
	System.out.println("Egg, chicken");
	System.out.println("Guava");
	System.out.println("Nuts & seeds");
	System.out.println("Lentils");

	}
	else if(LABApp.wbc>11.0){
	System.out.println("Grapes , Garlic");
	System.out.println("Avoid foods rich in fats , sugar & salt");
	}
	else{
	System.out.println("");}}
if(LABApp.hgb!=0){
	if(LABApp.hgb<14){
	System.out.println("Red meat , dark leafy green");
	System.out.println("");}
	else if(LABApp.hgb>18){
	System.out.println("");}
	else{
	System.out.println("");}}
if(LABApp.hct!=0){
	if(LABApp.hct<39.0){
	System.out.println("Red meat , eggs , spinach");
	System.out.println("Give up Cafffeine");}
	else if(LABApp.hct>54.0){
	System.out.println("Eat more bran");
	System.out.println("Avoid iron supplements , Alchohol");}
	else{System.out.println("");}}
if(LABApp.crt!=0){
	if(LABApp.crt<0.2){System.out.println("Consuume Meat , milk");}
	else if(LABApp.crt>0.6){System.out.println("Eat less red meat and fewer fish products");}
	else{System.out.println("");}}
if(LABApp.ual!=0){
	if(LABApp.ual<3.5){System.out.println("Seafood , red meat");}
	else if(LABApp.ual>7.7){System.out.println("Apples , French bean juice");
	System.out.println("Avoid alchohol , sugary fruits , beverages");}
	else{System.out.println("");}}
if(LABApp.chl!=0){
	if(LABApp.chl<110){System.out.println("processed foods such as biscuits");}
	else if(LABApp.chl>130){System.out.println("Consume Oats , whole grains");
	System.out.println("Avoid oil items");}
	else{System.out.println("");}}
if(LABApp.ldl!=0){
	if(LABApp.ldl<130){System.out.println("Consume Oat meal , oat bran");}
	else{System.out.println("");}}
if(LABApp.hdl!=0){
	if(LABApp.hdl<30){System.out.println("Consume oats , beans ");}
	else if(LABApp.hdl>75){System.out.println("Consume barley");}
	else{System.out.println("");}}
if(LABApp.tgd!=0){
	if(LABApp.tgd<40){System.out.println("consume sugary cereals");}
	else if(LABApp.tgd>170){System.out.println("Consume cold water fish");}
	else{System.out.println("");}}
if(LABApp.bpc!=0){
	if(LABApp.bpc<150000){System.out.println("Consume milk , green leafy vegetables");}
	else if(LABApp.bpc>450000){System.out.println("Consume dark chocolates & wine");}
	else{System.out.println("");}}
if(LABApp.t3!=0){
	if(LABApp.t3<60){System.out.println("Consume baked fish , diary & fresh eggs");}
	else if(LABApp.t3>180){System.out.println("Non-iodized salt , fresh fruits & oats");}
	else{System.out.println("");}}
if(LABApp.t4!=0){
	if(LABApp.t4<0.6){System.out.println("Consume Baked fish , dairy & fresh eggs");}
	else if(LABApp.t4>1.8){System.out.println("Consume cruciferous vegetables");}
	else{System.out.println("");}}}
else if(LABApp.g=='f'){
System.out.println("For Female..");
if(LABApp.rbc!=0){
	if(LABApp.rbc<4.2){System.out.println("Dark green leafy vegetables ");}
	else if(LABApp.rbc>5.4){System.out.println("Avoiding diuretrics(Caffeine)");}
	else{System.out.println("");}}
if(LABApp.wbc!=0){
	if(LABApp.wbc<3.8){
	System.out.println("Egg, chicken.");
	System.out.println("Guava ");
	System.out.println("Nuts & seeds");
	System.out.println("Lentils , Dried beans");}
	else if(LABApp.wbc>11.0){System.out.println("Lentils");}
	else{System.out.println("");}}
if(LABApp.hgb!=0){
	if(LABApp.hgb<11){System.out.println("Red meat , dark leafy green");}
	else if(LABApp.hgb>16){System.out.println("Consume meats , eggs");}
	else{System.out.println("");}}




if(LABApp.hct!=0){
	if(LABApp.hct<34.0){System.out.println("Red meat , eggs , spinach");
	System.out.println("Give up Cafffeine");}
	else if(LABApp.hct>47.0){System.out.println("Eat more bran");
	System.out.println("Avoid iron supplements , Alchohol");}
	else{System.out.println("");}}
if(LABApp.crt!=0){
	if(LABApp.crt<0.6){System.out.println("Consume Meat , milk");}
	else if(LABApp.crt>1.0){System.out.println("Eat less red meat and fewer fish products");}
	else{System.out.println("");}}
if(LABApp.ual!=0){
	if(LABApp.ual<2.5){System.out.println("Seafood , red meat");}
	else if(LABApp.ual>6.6){System.out.println("Apples , French bean juice");System.out.println("Avoid alchohol , sugary fruits , beverages");}
	else{System.out.println("");}}
if(LABApp.chl!=0){
	if(LABApp.chl<110){System.out.println("processed foods such as biscuits");}
	else if(LABApp.chl>130){System.out.println("Consume Oats , whole grains");System.out.println("Avoid oil items");}
	else{System.out.println("");}}
if(LABApp.ldl!=0){
	if(LABApp.ldl>130){System.out.println("Consume Oat meal , oat bran");}
	else{System.out.println("");}}
if(LABApp.hdl!=0){
	if(LABApp.hdl<30){System.out.println("Consume oats , beans ");}
	else if(LABApp.hdl>75){System.out.println("Consume barley");}
	else{System.out.println("");}}
if(LABApp.tgd!=0){
	if(LABApp.tgd<35){System.out.println("consume sugary cereals");}
	else if(LABApp.tgd>135){System.out.println("Consume cold water fish");}
	else{System.out.println("");}}
if(LABApp.bpc!=0){
	if(LABApp.bpc<150000){System.out.println("Consume milk , green leafy vegetables");}
	else if(LABApp.bpc>450000){System.out.println("Consume dark chocolates & wine");}
	else{System.out.println("");}}
if(LABApp.t3!=0){
	if(LABApp.t3<60){System.out.println("Consume baked fish , diary & fresh eggs");}
	else if(LABApp.t3>180){System.out.println("Non-iodized salt , fresh fruits & oats");}
	else{System.out.println("");}}
if(LABApp.t4!=0){
	if(LABApp.t4<0.9){System.out.println("Consume Baked fish , dairy & fresh eggs");}
	else if(LABApp.t4>2.3){System.out.println("Consume cruciferous vegetables");}
	else{System.out.println("");}}}

else if(LABApp.g=='c'){
System.out.println("For Children..");
if(LABApp.rbc!=0){
	if(LABApp.rbc<4.1){System.out.println("Dark green leafy vegetables ");}
	else if(LABApp.rbc>5.5){System.out.println("Avoiding diuretrics(Caffeine)");}
	else{System.out.println("");}}
if(LABApp.wbc!=0){
	if(LABApp.wbc<5.0){System.out.println("Egg, chicken.");
	System.out.println("Guava ");
	System.out.println("Nuts & seeds");
	System.out.println("Lentils , Dried beans");}
	else if(LABApp.wbc>10.0){System.out.println("Lentils");}
	else{System.out.println("");}}
if(LABApp.hgb!=0){
	if(LABApp.hgb<10.0){System.out.println("Red meat , dark leafy green");}
	else if(LABApp.hgb>14.0){System.out.println("Consume meats , eggs");}
	else{System.out.println("");}}
if(LABApp.hct!=0){
	if(LABApp.hct<30.0){System.out.println("Red meat , eggs , spinach");System.out.println("Give up Cafffeine");}
	else if(LABApp.hct>42.0){System.out.println("Eat more bran");System.out.println("Avoid iron supplements , Alchohol");}
	else{System.out.println("");}}
if(LABApp.crt!=0){
	if(LABApp.crt<0.44){System.out.println("Consume Meat , milk");}
	else if(LABApp.crt>0.65){System.out.println("Eat less red meat and fewer fish products");}
	else{System.out.println("");}}
if(LABApp.ual!=0){
	if(LABApp.ual<2.5){System.out.println("Seafood , red meat");}
	else if(LABApp.ual>5.5){System.out.println("Apples , French bean juice");System.out.println("Avoid alchohol , sugary fruits , beverages");}
	else{System.out.println("");}}
if(LABApp.tgd!=0){
	if(LABApp.tgd<150.0){System.out.println("consume sugary cereals");}
	else{System.out.println("Consume cold water fish");}}
if(LABApp.bpc!=0){
	if(LABApp.bpc<150000){System.out.println("Consume milk , green leafy vegetables");}
	else if(LABApp.bpc>450000){System.out.println("Consume dark chocolates & wine");}
	else{System.out.println("");}}
if(LABApp.t3!=0){
	if(LABApp.t3<60.0){System.out.println("Consume baked fish , diary & fresh eggs");}
	else if(LABApp.t3>180.0){System.out.println("Non-iodized salt , fresh fruits & oats");}
	else{System.out.println("");}}
if(LABApp.t4!=0){
	if(LABApp.t4<5.0){System.out.println("Consume Baked fish , dairy & fresh eggs");}
	else if(LABApp.t4>12.0){System.out.println("Consume cruciferous vegetables");}
	else{System.out.println("");}}
}}
public static void main(String...args){
LABApp.getdata();
LABApp.checkup();}}

//System.out.println("...............................................................................................................");








