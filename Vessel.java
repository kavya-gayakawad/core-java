class Vessel {

static int vesselId;
static String vesselName;
static String brandName;

static void setVesselId(int vId){
vesselId = vId;
}
static int getVesselId(){
return vesselId;
}
static void setVesselName(String vName){
vesselName = vName;

}
static String getVesselName(){
return vesselName;
}
static void setBrandName(String bName){
brandName = bName;
}
static String getBrandName(){
return brandName;
}
}