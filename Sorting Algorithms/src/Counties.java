import java.util.Arrays;


public class Counties 
{
    
	public static void main(String[] args) 
	{
        // array to store county names
		String[] county = 
		{
			"Adair County","Andrew County","Andrew County","Atchison County","Audrain County","Audrain County","Audrain County","Barry County","Barton County","Bates County","Benton County","Benton County","Benton County","Bollinger County","Boone County","Boone County Boone County Fairgrounds Regional Recreation District","Buchanan County","Butler County","Caldwell County","Callaway County","Camden County","Camden County Greenview Cid Cam-mo Ambulance District","Camden County Pulaski County Ambulance District","Camden County Cam-mo Ambulance District","Camden County Toad Cove Complex Cid And Toad Cove Complex Tdd","Camden County Toad Cove Resort Cid And Toad Cove Resort Tdd","Cape Girardeau County","Carroll County","Carter County","Carter County Landing River Center Cid","Cass County","Cass County Hospital Interchange Tdd","Cass County South Metropolitan Fire Protection District","Cedar County","Chariton County","Christian County","Clark County","Clay County",
			"Clay County Smithville Area Fire Protection District","Clinton County","Cole County","Cooper County","Cooper County Hail Ridge Cid","Crawford County","Crawford County Steelville Ambulance District And Bourbon Fire Protection District","Crawford County North Crawford County Ambulance District","Crawford County North Crawford County Ambulance District And Bourbon Fire Protection District","Crawford County North Crawford County Ambulance District And Sullivan Fire Protection District","Crawford County St James Ambulance District","Crawford County Steelville Ambulance District","Crawford County Sullivan Fire Protection District","Dade County","Dallas County","Daviess County","Daviess County Noel T Adams Ambulance District","Dekalb County","Dent County","Douglas County","Douglas County Ava Ambulance District","Dunklin County","Franklin County","Franklin County Gerald Area Ambulance District","Franklin County Meramec Ambulance District","Franklin County New Haven Ambulance District",
			"Franklin County St Clair Ambulance District And St Clair Fire Protection District","Franklin County Bourbon Fire Protection District","Franklin County Hermann Area Ambulance District","Franklin County Highway 100 Cid And Meramec Ambulance District","Franklin County Meramec Ambulance District And St Clair Fire Protection District","Franklin County Sullivan Fire Protection District","Franklin County Union Fire Protection District","Franklin County Washington Area Ambulance District","Gasconade County","Gasconade County Gerald Area Ambulance District","Gasconade County Owensville Ambulance District","Gasconade County Hermann Area Ambulance District","Gentry County","Greene County","Grundy County","Harrison County","Harrison County Noel T Adams Ambulance District","Henry County","Henry County Warsaw Lincoln Ambulance District","Hickory County","Holt County","Howard County","Howell County","Iron County","Iron County Iron County Hospital District","Jackson County",
			"Jackson County Sni Valley Fire Protection District","Jackson County Central Jackson County Fire Protection District","Jackson County Inter City Fire Protection District","Jackson County Prairie Township Fire Protection District","Jasper County","Jefferson County","Jefferson County Rock Township Ambulance District And Rock Community Fire Protection District","Jefferson County Antonia Fire Protection District And Joachim-plattin Ambulance District","Jefferson County Antonia Fire Protection District And Big River Ambulance District","Jefferson County Antonia Fire Protection District And Rock Township Ambulance District","Jefferson County Big River Ambulance District","Jefferson County Big River Ambulance District And High Ridge Fire Protection District","Jefferson County High Ridge Fire Protection District","Jefferson County High Ridge Fire Protection District And  Rock Township Ambulance District",
			"Jefferson County Imperial Main Cid And Rock Township Ambulance District And Rock Community Fire Protection District","Jefferson County Joachim-plattin Ambulance District","Jefferson County Joachim-plattin Ambulance District And Rock Community Fire Protection Distrcit","Jefferson County Meramec Ambulance District","Jefferson County Rock Community Fire Protection District","Jefferson County Rock Township Ambulance District","St Louis County","Jefferson County Springdale Community Improvement District And Rock Township Ambulance District","Jefferson County Biltmore East Cid And High Ridge Fire Protection District","Johnson County","Knox County","Laclede County","Laclede County Pulaski County Ambulance District","Lafayette County","Lafayette County Sni Valley Fire Protection District","Lawrence County","Lewis County","Lincoln County","Linn County","Livingston County","Macon County","Madison County","Maries County","Maries County Maries Osage Ambulance District","Maries County St James Ambulance District",
			"Marion County","Marion County Marion County Ambulance District","Marion County Monroe City Ambulance District","Mcdonald County","Mercer County","Miller County","Miller County Miller County Ambulance District","Mississippi County","Moniteau County","Monroe County","Monroe County Monroe City Ambulance District","Montgomery County","Montgomery County Hermann Area Ambulance District","Morgan County Cam-mo Ambulance District","Morgan County Mid-mo Ambulance District","New Madrid County","Newton County","Newton County Neosho Tdd","Nodaway County","Oregon County","Osage County","Osage County Maries Osage Ambulance District","Osage County Osage Ambulance District","Ozark County","Pemiscot County","Perry County","Pettis County","Pettis County Cole Camp Ambulance District","Phelps County","Phelps County St James Ambulance District","Pike County","Pike County Van Far Ambulance District","Platte County","Platte County Smithville Area Fire Protection District","Polk County","Pulaski County",
			"Pulaski County Pulaski County Ambulance District","Putnam County","Ralls County","Ralls County Van Far Ambulance District","Ralls County Monroe City Ambulance District","Randolph County","Ray County","Ray County Orrick Fire Protection District","Ray County Orrick Fire Protection District And Ray County Ambulance District","Ray County Ray County Ambulance District","Reynolds County","Ripley County","Saline County","Schuyler County","Scotland County","Scott County","Shannon County","Shelby County","Shelby County Monroe City Ambulance District","Shelby County Salt River Ambulance District","St Charles County","St Clair County","St Clair County Collins Cid","St Francois County","St Louis County Midwest Plaza Cid","St Louis County Paddock Forest Cid","St Louis County St Johns Church Rd Tdd","St Louis County Tori Pines Commons Cid","St Louis County University Place Tdd","St Louis County Victoria Crossings Cid","St Louis County (t1)","St Louis County (t2)","St Louis County (t3)",
			"St Louis County (t3) Mayfair Plaza Cid And Hwy 367 & Parker Rd Tdd","Ste Genevieve County","Stoddard County","Stone County","Stone County Branson Lakes Area Tced And Southern Stone County Fire Protection District","Stone County","Stone County Southern Stone County Fire Protection District","Sullivan County","Taney County","Taney County Branson Lakes Area Tced","Texas County","Vernon County","Warren County","Warren County Hermann Area Ambulance District","Washington County","Washington County Bourbon Fire Protection District","Washington County Sullivan Fire Protection District","Wayne County","Webster County","Worth County","Wright County","Ozark County","Franklin County","St Louis County","Dekalb County","Montgomery County","Scott County","Iron County","Ripley County","Jackson County","Stone County","St Louis County","Harrison County","Barry County","Audrain County","Cape Girardeau County","St Louis County","Stoddard County","St Louis County","St Louis County","Linn County","Caldwell County",
			"St Louis County","Cooper County","Gasconade County","Jasper County","Jackson County","Texas County","Gasconade County","Taney County","St Louis County","Henry County","Bates County","St Francois County","Jefferson County","Dekalb County","Cooper County","Taney County","Pemiscot County","Cedar County","Perry County","Jefferson County","Barry County","Dallas County","Andrew County","St Louis County","Jackson County","Nodaway County","Gasconade County","Iron County","New Madrid County","Bollinger County","St Louis County","Mississippi County","Ste Genevieve County","Holt County","St Louis County","Polk County","St Louis County","Osage County","St Charles County","Barry County","Jefferson County","Shannon County","Taney County","Pemiscot County","Pulaski County","Christian County","Jackson County","Osage County","Clinton County","Scotland County","Lewis County","Grundy County","Jasper County","Phelps County","Cooper County","New Madrid County","Pike County","Howell County","Harrison County","Moniteau County",
			"St Louis County","Henry County","St Louis County","Jefferson County","Taney County","Jefferson County","St Louis County","Washington County","Perry County","St Louis County","Bates County","St Louis County","Stoddard County","St Louis County","Morgan County","Callaway County","Maries County","Carroll County","Jefferson County","Daviess County","Jackson County","Oregon County","Perry County","St Louis County","Taney County","Macon County","St Clair County","Adair County","St Louis County","St Louis County","Iron County","Shelby County","Chariton County","Jasper County","Harrison County","Montgomery County","Pemiscot County","Knox County","Camden County","Texas County","Crawford County","Dent County","Pemiscot County","Henry County","Vernon County","Miller County","Maries County","Caldwell County","Dunklin County","Taney County","St Louis County","Cass County","Polk County","Scott County","Mississippi County","Jefferson County","Jasper County","Linn County","Howell County","Macon County",
			"Cape Girardeau County","Osage County","Christian County","Pike County","St Francois County","Dade County","Cass County","Caldwell County","Stoddard County","St Louis County","St Louis County","Stoddard County","Scott County","Taney County","Greene County","Cass County","Randolph County","Lafayette County","Stone County","Reynolds County","Jefferson County","Cape Girardeau County","Clay County","Cape Girardeau County","Macon County","Mcdonald County","Butler County","Chariton County","Livingston County","Jasper County","Lafayette County","Maries County","Linn County","Lawrence County","St Louis County","St Louis County","Jackson County","Shannon County","Washington County","Stoddard County","Douglas County","Ray County","Howard County","Platte County","St Louis County","Jackson County","Jackson County","St Louis County","Pike County","Wayne County","Platte County","Jefferson County","Jasper County","St Louis County","Jasper County","Franklin County","Iron County","Dunklin County","Cass County",
			"St Louis County","St Louis County","Ozark County","Dunklin County","St Louis County","Dent County","Nodaway County","St Louis County","St Louis County","Macon County","Bates County","Gentry County","St Louis County","St Louis County","Camden County","Cass County","St Louis County","Jasper County","Wright County","Miller County","Dade County","Clark County","Clay County","St Francois County","Greene County","St Louis County","Bates County","Sullivan County","Newton County","Lafayette County","St Louis County","Franklin County","St Louis County","Jefferson County","St Louis County","Reynolds County","Texas County","St Louis County","Greene County","Holt County","Jackson County","Saline County","Cass County","Jasper County","St Louis County","St Louis County","Polk County","Barton County","Taney County","Crawford County","Lawrence County","Buchanan County","Taney County","Saline County","St Louis County","Lafayette County","St Louis County","Stoddard County","Jasper County","Dent County","Boone County",
			"Pike County","Washington County","Andrew County","Greene County","Franklin County","Nodaway County","Cooper County","St Louis County","St Louis County","Ozark County","Worth County","Jackson County","Jefferson County","Scott County","Carroll County","Carroll County","St Louis County","Cooper County","Cape Girardeau County","St Louis County","St Louis County","Montgomery County","Taney County","Gasconade County","St Charles County","Reynolds County","St Louis County","Pemiscot County","Nodaway County","Wright County","Clay County","Texas County","Moniteau County","St Louis County","Christian County","St Louis County","Cass County","Shelby County","St Louis County","Nodaway County","Butler County","St Louis County","Lincoln County","Buchanan County","Wayne County","Howard County","Vernon County","Christian County","St Louis County","Boone County","St Louis County","St Louis County","Livingston County","Ray County","Saline County","Henry County","Pemiscot County","Scotland County","Boone County",
			"Jefferson County","Platte County","Shannon County","Newton County","St Clair County","St Louis County","Butler County","Cass County","Wright County","Lincoln County","Clinton County","Pulaski County","Gentry County","Gentry County","St Louis County","St Francois County","St Louis County","St Louis County","Jefferson County","Nodaway County","St Louis County","Wayne County","Clay County","Dunklin County","Boone County","Pike County","St Louis County","St Louis County","Polk County","Franklin County","Webster County","St Louis County","Macon County","St Charles County","St Louis County","Jackson County","Hickory County","Worth County","Grundy County","St Charles County","St Louis County","Worth County","St Louis County","Cass County","Carroll County","Jasper County","St Louis County","St Louis County","Phelps County","Cape Girardeau County","St Francois County","Cass County","St Louis County","Holt County","St Louis County","Holt County","Morgan County","St Louis County","Iron County","Iron County",
			"St Louis County","Christian County","Bollinger County","Warren County","Pike County","Callaway County","Ozark County","Carter County","St Louis County","Madison County","Lincoln County","Dade County","Crawford County","St Louis County","Pemiscot County","Ralls County","Taney County","Crawford County","Osage County","Barry County","Scott County","St Louis County","Ralls County","Newton County","Saline County","Ray County","Ozark County","St Louis County","Camden County","Sullivan County","Randolph County","Pemiscot County","Caldwell County","Cass County","Miller County","St Louis County","Livingston County","Gasconade County","St Louis County","Pemiscot County","Hickory County","Ray County","Vernon County","Wright County","Osage County","Knox County","Pike County","Ste Genevieve County","St Charles County","Pemiscot County","Carter County","Lafayette County","Scott County","Reynolds County","Bollinger County","St Louis County","St Louis County","St Louis County","Lawrence County","Polk County",
			"St Louis County","Monroe County","Scott County","St Louis County","St Louis County","Cass County","Schuyler County","Lawrence County","St Louis County","Ripley County","Stone County","Taney County","Schuyler County","Andrew County","Chariton County","Jackson County","Saline County","St Charles County","St Louis County","Jefferson County","New Madrid County","St Louis County","St Louis County","Cole County","St Louis County","Newton County","Jefferson County","Lewis County","Adair County","St Louis County","St Louis County","Dent County","St Louis County","Christian County","Maries County","Laclede County","Boone County","Crawford County","Mississippi County","Ray County","Andrew County","Livingston County","St Louis County","Boone County","Benton County","Cass County","Texas County","St Louis County","Christian County","Moniteau County","St Louis County","Howard County","Perry County","Cass County","Oregon County","Barton County","Randolph County","St Francois County","Mcdonald County","Cass County",
			"Sullivan County","St Louis County","Lafayette County","Randolph County","Boone County","St Louis County","Dunklin County","St Louis County","St Louis County","St Louis County","Gentry County","Washington County","Warren County","Newton County","Buchanan County","Texas County","Cape Girardeau County","Marion County","St Louis County","St Francois County","St Louis County","St Louis County","St Louis County","Bates County","Howell County","Ozark County","Buchanan County","Cass County","Cape Girardeau County","Hickory County","Lafayette County","St Louis County","St Louis County","Pemiscot County","Schuyler County","Clinton County","Phelps County","New Madrid County","Daviess County","St Charles County","St Louis County","Wayne County","Mississippi County","St Louis County","St Louis County","St Louis County","Iron County","Morgan County","Barry County","St Louis County","Mercer County","Jefferson County","St Louis County","Lincoln County","Boone County","Nodaway County","St Louis County",
			"Ray County","Platte County","St Louis County","Jefferson County","St Louis County","Lafayette County","Holt County","St Louis County","Jackson County","Newton County","St Louis County","Platte County","St Louis County","Lincoln County","Nodaway County","Cass County","Stoddard County","Pike County","St Louis County","Lincoln County","Newton County","Cape Girardeau County","Dekalb County","Stone County","Boone County","Osage County","Dade County","Boone County","Cape Girardeau County","Jackson County","Montgomery County","St Louis County","Lincoln County","Lawrence County","Lafayette County","Jasper County","Christian County","St Louis County","Johnson County","Scotland County","Cass County","St Louis County","Macon County","St Louis County","Ozark County","Miller County","Scott County","St Charles County","Stoddard County","St Louis County","Clay County","St Louis County","Sullivan County","Laclede County","Pike County","Crawford County","St Louis County","Benton County","Saline County",
			"St Louis County","Andrew County","Clay County","St Louis County","Grundy County","Atchison County","Schuyler County","St Louis County","Montgomery County","Marion County","Madison County","Clay County","Cole County","St Charles County","St Louis County","St Charles County","St Louis County","Jackson County","Pemiscot County","Pettis County","St Louis County","Jackson County","Crawford County","Jackson County","St Louis County","Polk County","Clark County","St Louis County","Stoddard County","Wayne County","Clay County","St Louis County","St Louis County","St Louis County","Phelps County","Mcdonald County","St Louis County","Harrison County","Johnson County","Greene County","Daviess County","Callaway County","St Louis County","Cass County","Jefferson County","Jefferson County","Chariton County","Caldwell County","Crawford County","St Louis County","Andrew County","Harrison County","Cedar County","St Louis County","St Louis County","Butler County","Jefferson County","Jefferson County",
			"Howard County","Clinton County","Chariton County","St Louis County","Boone County","St Louis County","St Louis County","Boone County","Hickory County","Carroll County","Jefferson County","St Clair County","Bollinger County","Webster County","Webster County","St Louis County","Cole County","Jefferson County","Boone County","Platte County","Pulaski County","Pulaski County","St Louis County","Stone County","St Charles County","Shelby County","Mcdonald County","St Charles County","Texas County","Perry County","Perry County","St Louis County","St Francois County","Scott County","Carter County","Franklin County","Pettis County","Clay County","Buchanan County","Polk County","St Louis County","St Louis County","St Louis County","Cape Girardeau County","Scott County","Christian County","Henry County","St Louis County","Ray County","Jackson County","St Charles County","St Louis County","Nodaway County","Pike County","Jackson County","Ray County","St Louis County","St Louis County","Dunklin County",
			"Monroe County","St Louis County","Boone County","St Louis County","Boone County","Harrison County","Jasper County","Laclede County","Stoddard County","Nodaway County","Polk County","St Louis County","St Louis County","Benton County","Audrain County","Cass County","Pulaski County","St Louis County","Moniteau County","St Francois County","Ripley County","Douglas County","Jefferson County","Reynolds County","Ripley County","Vernon County","St Louis County","Camden County","Pemiscot County","St Francois County","St Louis County","Macon County","Dekalb County","Polk County","Bates County","Holt County","Buchanan County","Crawford County","Boone County","Lewis County","Boone County","St Louis County","St Louis County","Barry County","St Louis County","St Louis County","Boone County","Livingston County","Polk County","Christian County","Dade County","Adair County","Jefferson County","Clay County","Clay County","Jackson County","Dallas County","Camden County","Sullivan County","St Louis City",
			"St Louis County","Wright County","St Louis County","Christian County","St Francois County","Taney County", "St Francois County","Scott County","Clay County","St Charles County","Jasper County","Washington County","Macon County","Franklin County","New Madrid County","Cass County","Jackson County","Lafayette County","St Louis City","St Charles County","Miller County","St Clair County","Putnam County","Mcdonald County","Jackson County","Adair County","Madison County","Texas County","Crawford County","Jackson County","Scott County","St Charles County","Adair County","Greene County","Osage County","Howard County","St Louis County","Shelby County","St Louis City","St Louis County","Audrain County","Franklin County","Ozark County","Butler County","Morgan County","St Louis County","Cape Girardeau County","Monroe County","Cass County","St Louis City","Texas County","Lawrence County","Laclede County","Lincoln County","Macon County","Camden County","Howell County","Ozark County","Taney County",
			"Bollinger County","Platte County","St Louis County","Moniteau County","St Louis City","Perry County","Moniteau County","St Charles County","Washington County","Platte County","St Louis County","Cooper County","Franklin County","Boone County","Reynolds County","St Charles County","St Louis City","Vernon County","Ozark County","Ste Genevieve County","Carroll County","Texas County","Wright County","Wright County","St Louis County","Laclede County","St Louis County","Lafayette County","St Clair County","Dekalb County","Platte County","Mercer County","Taney County","St Charles County","Ozark County","Laclede County","Butler County","St Charles County","Clay County","St Louis County","Mississippi County","Linn County","Vernon County","Daviess County","St Louis County","Boone County","Newton County","Greene County","Saline County","Lincoln County","Scott County","Pettis County","Moniteau County","Greene County","Stone County","St Louis County","Bates County","Scott County","Daviess County",
			"Osage County","Franklin County","Cass County","St Louis City","Clay County","St Louis County","St Charles County","Johnson County","New Madrid County","Atchison County","St Louis County","Randolph County","St Louis County","St Louis County","Jackson County","St Charles County","Platte County","St Louis County","Daviess County","Jackson County","Ste Genevieve County","Jackson County","Wayne County","Vernon County","Sullivan County","St Louis City","Warren County","St Louis City","Newton County","Clay County","Stone County","St Charles County","Ralls County","St Louis County","New Madrid County","St Charles County","Franklin County","Bollinger County","St Charles County","Vernon County","Cole County","Chariton County","Lewis County","St Francois County","Nodaway County","Wayne County","Jasper County","Platte County","St Charles County","Bates County","Douglas County","Montgomery County","Knox County","St Clair County","Dekalb County","St Louis County","Barry County","St Louis County",
			"Cole County","Jackson County","Howell County","New Madrid County","Webster County","St Francois County","Audrain County","Cape Girardeau County","Scott County","Dade County","St Louis County","Knox County","Harrison County","Putnam County","St Louis County","Callaway County","Nodaway County","St Louis County","Lincoln County","Lawrence County","Johnson County","St Louis County","Wright County","Jasper County","Cole County","Platte County","Franklin County","Perry County","Putnam County","Platte County","Clinton County","St Louis City","Sullivan County","St Louis County","Dekalb County","St Louis City","Jackson County","Gasconade County","Scott County","Ralls County","Montgomery County","Clay County","Scotland County","Christian County","Harrison County","Benton County","St Louis County","Miller County","Ozark County","Ralls County","St Charles County","Jasper County","Jackson County","Greene County","Perry County","St Charles County","Camden County","Cole County","Shannon County",
			"Cedar County","Vernon County","Ste Genevieve County","Platte County","St Louis County","St Louis County","St Louis City","Franklin County","St Louis County","Jackson County","Franklin County","Jefferson County","Butler County","Chariton County","Polk County","Franklin County","Howell County","Jackson County","St Louis County","Montgomery County","St Louis County","Cape Girardeau County","Montgomery County","Clay County","Gentry County","St Charles County","Moniteau County","St Louis County","Jefferson County","Boone County","Jackson County","Howell County","Livingston County","St Louis County","Pettis County","Camden County","Holt County","St Louis County","Scott County","St Louis County","Barton County","Jasper County","Taney County","Cooper County","Carter County","Cass County","Mercer County","Webster County","Dallas County","Jefferson County","St Louis County","St Louis County","Nodaway County","Moniteau County","Jackson County","Miller County","Randolph County","Lewis County",
			"Johnson County","Jasper County","St Louis County","Perry County","Jackson County","Greene County","Morgan County","Lincoln County","Lafayette County","Pettis County","Mcdonald County","Vernon County","Clay County","Osage County","Holt County","Bates County","Jackson County","Clay County","Morgan County","Clay County","Ozark County","Clay County","Christian County","Scott County","New Madrid County","Jackson County","Jefferson County","Polk County","Lafayette County","Ralls County","Platte County","Jefferson County","Cole County","Cole County","Linn County","St Clair County","St Louis County","Wright County","Cass County","Boone County","St Louis County","Cooper County","Jackson County","Bollinger County","St Charles County","St Louis County","Lewis County","Jackson County","Greene County","St Louis County","Dunklin County","Camden County","Texas County","Dunklin County","Dent County","Clay County","Newton County","Mcdonald County","Lawrence County","St Louis County","Schuyler County",
			"Monroe County","Scott County","Jackson County","Barry County","Jackson County","St Louis County","St Louis County","St Louis County","Cass County","Laclede County","Christian County","St Louis County","Dunklin County","Howell County","Lewis County","St Louis County","Jasper County","Clinton County","Lewis County","St Charles County","Chariton County","Ray County","Madison County","Callaway County","St Louis City","St Louis County","Scott County","Gasconade County","Lewis County","Platte County","St Charles County","Caldwell County","Polk County","Platte County","Schuyler County","Boone County","Gasconade County","Howell County","Audrain County","Dent County","St Louis County","Lincoln County","Camden County","Greene County","New Madrid County","Andrew County","Ozark County","New Madrid County","St Louis County","Jasper County","Jasper County","Franklin County","Washington County","Christian County","Franklin County","Linn County","Vernon County","Randolph County","St Louis City",
			"Dade County","Carter County","St Louis City","New Madrid County","Miller County","St Louis County","Iron County","Shannon County","Jasper County","Washington County","New Madrid County","Pemiscot County","Jackson County","Buchanan County","Franklin County","Taney County","Taney County","St Louis City","Platte County","Washington County","Gentry County","Clay County","Randolph County","Texas County","St Louis County","Lincoln County","Greene County","Pike County","Putnam County","Monroe County","St Louis County","Jefferson County","Shannon County","Pemiscot County","Pettis County","Jackson County","Henry County","St Louis County","Mississippi County","Buchanan County","Camden County","St Charles County","St Louis City","Perry County","Vernon County","St Louis County","Ralls County","Barton County","Holt County","Stone County","St Louis County","Ozark County","Madison County","St Louis City","Laclede County","St Louis County","Miller County","Ozark County","Barton County","St Francois County",
			"St Louis City","Newton County","Jackson County","Ralls County","Jackson County","Nodaway County","Caldwell County","St Louis City","Stoddard County","St Louis County","Cole County","Andrew County","Clay County","St Louis City","Butler County","Scott County","New Madrid County","Lincoln County","Newton County","Ripley County","Newton County","Greene County","Jackson County","Pike County","Pulaski County","Gentry County","St Louis County","St Louis County","Jackson County","Crawford County","Platte County","Jackson County","Jackson County","Sullivan County","Cole County","St Louis County","Jackson County","Montgomery County","St Louis County","Iron County","St Charles County","Jefferson County","Reynolds County","Bates County","Clay County","Jackson County","Phelps County","Pike County","St Charles County","St Charles County","Barry County","Hickory County","Mcdonald County","Greene County","Boone County","Cass County","Bates County","Caldwell County","Pulaski County","St Louis City",
			"St Louis County","Oregon County","Barton County","Pulaski County","Audrain County","Wayne County","Perry County","Washington County","Holt County","Polk County","St Louis City","St Louis County","Jefferson County","Jackson County","St Louis County","Greene County","Daviess County","St Louis County","Monroe County","Cape Girardeau County","St Louis County","Platte County","Carter County","Clinton County","Jefferson County","Greene County","Jasper County", "Cass County","Greene County","Greene County","Morgan County","Ray County","Madison County","Audrain County","St Charles County","St Louis County","Grundy County","Jackson County","St Louis County","Lawrence County","St Louis County","Knox County","Johnson County","Cass County","Montgomery County","St Louis County","Shelby County","Jefferson County","Clay County","St Louis County","Dunklin County","Warren County","St Charles County","Knox County","Franklin County","Oregon County","Bollinger County","Callaway County","Harrison County",
			"Jackson County","Pike County","St Louis County","Greene County","Douglas County","Macon County","St Louis County","New Madrid County","Phelps County","Jackson County","St Louis County","Stone County","Crawford County","Camden County","Audrain County","Texas County","Jackson County","St Louis County","Lawrence County","Pulaski County","Clay County","St Louis City","Pettis County","Nodaway County","Clark County","Franklin County","Texas County","Jackson County","Clay County","Saline County","Cedar County","Dent County","Laclede County","Stone County","Jackson County","Jackson County","Iron County","Randolph County","St Louis City","Dekalb County","Lafayette County","Platte County","Scotland County","Cole County","Hickory County","Shannon County","Saline County","Sullivan County","Pulaski County","Mercer County","Jackson County","St Louis County","Franklin County","Taney County","Jackson County","Hickory County","St Louis City","St Louis County","Taney County","Wayne County","Jefferson County",
			"Sullivan County","Carroll County","Phelps County","Clay County","Ralls County","Atchison County","Christian County","Warren County","Oregon County","Christian County","Butler County","Wayne County","Monroe County","St Louis County","Osage County","St Louis City","Cape Girardeau County","Barton County","Clay County","Ripley County","Dallas County","Andrew County","Miller County","Chariton County","Clay County","Jackson County","Lewis County","Callaway County","Worth County","Clark County","St Louis County","Clinton County","Christian County","Franklin County","Ozark County","New Madrid County","Monroe County","Dent County","Miller County","St Louis County","St Louis County","Texas County","Cass County","Ray County","Oregon County","Reynolds County","St Louis County","Clay County","Stone County","Jackson County","Cass County","Scotland County","St Louis County","Jackson County","Wayne County","Miller County","Gasconade County","Stoddard County","St Charles County","Taney County","Clinton County",
			"Platte County","Cape Girardeau County","St Louis County","Newton County","Moniteau County","Clay County","Buchanan County","St Louis County","Texas County","Buchanan County","Cass County","St Charles County","Adair County","Franklin County","St Louis County","Jackson County","Laclede County","Atchison County","New Madrid County","Howard County","Phelps County","Jackson County","Dade County","Camden County","St Louis County","Osage County","Wayne County","Jackson County","Miller County","Clay County","Newton County","Mcdonald County","Jackson County","Madison County","St Louis County","Monroe County","Miller County","Barton County","Linn County","Ozark County","Bollinger County","Camden County","Ralls County","Pulaski County","St Louis County","St Louis County","Barry County","Taney County","Franklin County","Chariton County","Newton County","Taney County","Grundy County","Audrain County","Warren County","St Louis County","Ray County","Clay County","Callaway County","Ozark County","Platte County",
			"Saline County","Saline County","Taney County","Webster County","Mcdonald County","Cass County","Taney County","St Louis City","St Louis County","Stoddard County","Platte County","Laclede County","Platte County","Mcdonald County","Gasconade County","St Louis City","Vernon County","Marion County","Webster County","St Louis County","St Louis City","St Charles County","Shelby County","Cole County","Greene County","St Louis County","Ozark County","Jackson County","New Madrid County","Callaway County","Macon County","Barton County","Marion County","St Charles County","Livingston County","Jackson County","Platte County","Jefferson County","Jefferson County","Texas County","Jefferson County","Shelby County","Jackson County","Nodaway County","Stone County","Linn County","Lawrence County","Greene County","Carroll County","Warren County","Benton County","Marion County","Reynolds County","Camden County","Atchison County","St Charles County","Grundy County","Benton County","Andrew County","Jefferson County",
			"St Charles County","Franklin County","St Louis County","St Louis County","Platte County","St Charles County","St Louis City","Pemiscot County","Ray County","St Louis County","Dunklin County","Callaway County","St Louis County","Stoddard County","Christian County","Lincoln County","St Louis City","Knox County","Phelps County","Randolph County","Johnson County","St Louis City","New Madrid County","Buchanan County","Jackson County","Jefferson County","St Louis County","Montgomery County","Henry County","Pulaski County","Laclede County","St Louis County","St Louis County","Clark County","Franklin County","Morgan County","Newton County","Buchanan County","Webster County","Platte County","Barton County","St Louis City","Chariton County","Cass County","Franklin County","St Clair County","Callaway County","Barry County","Jackson County","Newton County","Clay County","Cooper County","Nodaway County","St Louis County","Clinton County","Henry County","Cole County","Texas County","St Louis City",
			"Greene County","Madison County","Jefferson County","Jackson County","Saline County","Lawrence County","Jasper County","Pemiscot County","Linn County","Scott County","Pemiscot County","Newton County","Mercer County","Dallas County","Clark County","St Louis County","Wayne County","St Louis County","Callaway County","St Charles County","Grundy County","Christian County","Chariton County","Newton County","St Louis City","Stoddard County","Jackson County","Mcdonald County","Clay County","Howell County","Ray County","Caldwell County","Crawford County","Jackson County","Dunklin County","Newton County","Pulaski County","Shelby County","Dent County","Jefferson County","Cole County","Vernon County","Livingston County","Boone County","St Louis County","St Louis County","St Louis County","St Louis County","St Charles County","Clay County","Gasconade County","Camden County","Carter County","Shelby County","Ste Genevieve County","Stone County","Miller County","St Louis City","Jackson County",
			"St Louis City","Cape Girardeau County","Bollinger County","Ripley County","Cape Girardeau County","Marion County","Newton County","Lafayette County","Crawford County","Clay County","Newton County","Ozark County","Linn County","Jackson County","Saline County","Caldwell County","St Louis County","Platte County","St Louis County","Clay County","Clay County","Mcdonald County","Taney County","Barry County","Jackson County","Franklin County","Chariton County","Harrison County","St Francois County","Saline County","Benton County","Camden County","Miller County","St Louis County","Dallas County","Callaway County","Taney County","Texas County","Taney County","St Louis County","St Charles County","Morgan County","Worth County","St Charles County","Osage County","St Louis County","Jefferson County","Ozark County","Sullivan County","Cooper County","St Charles County","Crawford County","Benton County","St Louis County","Livingston County","St Charles County","St Clair County","St Louis County",
			"Maries County","Lewis County","Cape Girardeau County","Benton County","Ray County","Pemiscot County","St Louis County","Howell County","Cooper County","Henry County","St Louis County","Jackson County","Newton County","Polk County","Vernon County","Greene County","Hickory County","Mississippi County","Osage County","St Louis County","Pulaski County","St Charles County","Mississippi County","Osage County","Phelps County","St Louis County","Warren County","Greene County","Pulaski County","St Francois County","Howell County","Iron County","St Louis County","Howell County","Ozark County","Ste Genevieve County","Johnson County","Atchison County","Cooper County","Shannon County","St Louis County","Platte County","Franklin County","Iron County","Marion County","Callaway County","St Charles County","Lincoln County","Carroll County","St Charles County","Howell County","Pettis County","Crawford County","Lafayette County","Hickory County","Ste Genevieve County","St Charles County","Mississippi County",
			"Perry County","Johnson County","St Louis County","Wayne County","Miller County","Johnson County","Ray County","Franklin County","Johnson County","St Charles County","Barry County","Platte County","Dallas County","Boone County","Putnam County","Platte County","Clark County","St Louis County","Montgomery County","Dunklin County","Daviess County","Barry County","Cass County","St Louis County","Lincoln County","Howell County","Maries County","Lawrence County","Camden County","Jasper County","Wayne County","St Charles County","Cole County","St Louis County","Franklin County","Chariton County","Jasper County","St Louis County","Clark County","Dekalb County","Cass County","Warren County","Lafayette County","St Louis County","Atchison County","St Charles County","Camden County","Pulaski County"
		};
        
		// array to store tax rate
		double[] taxRate = 
		{
			0.05925,0.06425,0.06475,0.0635,0.0685,0.0685,0.05725,0.05725,0.05225,0.05725,0.06225,0.06225,0.0585,0.05975,0.06475,0.05825,0.05225,0.06725,0.05725,0.05475,0.06975,0.05975,0.05975,0.07475,0.07475,0.05225,0.05475,0.05725,0.06725,0.05975,0.06975,0.06475,0.06225,0.061,0.05975,0.06725,0.05225,0.05725,0.04725,0.05725,0.06225,0.07225,0.061,0.071,0.066,0.071,0.071,0.066,0.066,0.066,0.06475,0.06225,0.06225,0.06725,0.05725,0.05475,0.05725,0.06225,0.05225,0.05975,0.06475,0.06475,0.06475,0.06975,0.06475,0.06475,0.07475,0.06975,0.06475,0.06475,0.0635,0.056,0.061,0.061,0.061,0.05225,0.05475,0.05725,0.05475,0.05975,0.05675,0.06175,0.05725,0.06725,0.0685,0.05162,0.05725,0.06225,0.056,0.05975,0.05975,0.06475,0.05975,0.0545,0.0635,0.071,0.0735,0.0735,0.071,0.0735,0.0735,0.0685,0.071,0.081,0.0685,0.0735,0.0685,0.0685,0.066,0.07113,0.076,0.0785,0.06475,0.06725,0.05413,0.05913,0.0585,0.0635,0.0535,0.0735,0.06475,0.06225,0.04975,0.0685,0.06225,0.05891,0.06391,0.06391,0.0585,0.066,0.0635,
			0.06225,0.06475,0.05225,0.05725,0.05975,0.06225,0.05725,0.06225,0.06475,0.06975,0.05725,0.05725,0.06225,0.0535,0.056,0.06225,0.06225,0.05975,0.06475,0.06475,0.06725,0.06725,0.061,0.05225,0.05725,0.0535,0.0585,0.06225,0.06725,0.056,0.061,0.056,0.05475,0.05975,0.06225,0.06725,0.07225,0.07225,0.05975,0.05725,0.06225,0.06725,0.06225,0.05725,0.06225,0.056,0.06225,0.05475,0.05225,0.05225,0.06225,0.06725,0.06725,0.0595,0.04725,0.05725,0.0635,0.07613,0.08113,0.07613,0.07613,0.08113,0.07613,0.07113,0.07113,0.07113,0.08613,0.06725,0.05413,0.05975,0.07475,0.07475,0.06475,0.06975,0.061,0.071,0.061,0.05225,0.06225,0.06725,0.07225,0.07725,0.07725,0.05725,0.06308,0.061,0.056,0.06725,0.09975,0.08613,0.05725,0.06975,0.06225,0.06225,0.06225,0.081,0.08475,0.09613,0.05975,0.06225,0.0685,0.05225,0.07613,0.06663,0.08925,0.07613,0.08225,0.07725,0.08613,0.09225,0.081,0.0795,0.066,0.061,0.061,0.086,0.09363,0.05675,0.06225,0.0785,0.071,0.08725,0.07225,0.061,0.08225,0.06225,0.061,0.0835,0.07225,
			0.07725,0.06425,0.07863,0.076,0.06225,0.061,0.08225,0.06225,0.0585,0.07613,0.05975,0.07725,0.06725,0.08113,0.056,0.09113,0.06475,0.0745,0.086,0.0885,0.05225,0.096,0.06725,0.05975,0.07475,0.076,0.07975,0.07725,0.05475,0.08975,0.05725,0.082,0.0535,0.08225,0.06225,0.06225,0.05162,0.05475,0.07975,0.09613,0.07675,0.08113,0.0835,0.076,0.0685,0.08363,0.07225,0.061,0.08363,0.05225,0.08363,0.06413,0.09363,0.05725,0.07475,0.07891,0.07225,0.0685,0.06225,0.056,0.08225,0.061,0.08113,0.061,0.0835,0.071,0.066,0.08113,0.08363,0.05725,0.07725,0.081,0.0645,0.0785,0.08475,0.06725,0.06725,0.07475,0.061,0.066,0.05475,0.06725,0.06675,0.05225,0.06725,0.06391,0.09225,0.06225,0.091,0.07863,0.09725,0.081,0.07975,0.07475,0.066,0.0545,0.08475,0.05162,0.0785,0.05225,0.07475,0.05975,0.06225,0.0835,0.06475,0.09225,0.07725,0.07413,0.08113,0.08363,0.05413,0.05225,0.096,0.05475,0.08725,0.05975,0.0635,0.06475,0.07725,0.071,0.08975,0.06225,0.05225,0.0685,0.07725,0.05225,0.061,0.04975,0.0645,0.0585,0.07391,
			0.07225,0.0785,0.08113,0.07613,0.056,0.07225,0.07225,0.07413,0.07725,0.06225,0.0685,0.056,0.09113,0.091,0.091,0.08113,0.06225,0.05725,0.056,0.0935,0.0545,0.09613,0.0695,0.06475,0.07475,0.07475,0.07475,0.09113,0.09613,0.06725,0.07225,0.08363,0.05475,0.06225,0.09613,0.08113,0.0785,0.0785,0.07225,0.08113,0.07613,0.08475,0.09725,0.08363,0.092,0.056,0.06225,0.06475,0.07725,0.06225,0.0635,0.07475,0.09613,0.07975,0.08975,0.0535,0.0785,0.09363,0.07475,0.08863,0.0835,0.08613,0.05725,0.076,0.08363,0.06975,0.06725,0.081,0.081,0.06475,0.0545,0.08613,0.08113,0.056,0.05725,0.096,0.091,0.0535,0.05825,0.071,0.061,0.09613,0.0585,0.08363,0.05413,0.0745,0.07475,0.07975,0.08475,0.08225,0.06425,0.07975,0.06475,0.06225,0.06225,0.08363,0.08113,0.07725,0.071,0.091,0.071,0.05225,0.05475,0.05475,0.08613,0.08225,0.07975,0.07613,0.08613,0.06475,0.086,0.071,0.0895,0.06725,0.08363,0.06725,0.06225,0.056,0.06975,0.061,0.06225,0.07613,0.05975,0.08113,0.07975,0.06725,0.09613,0.06225,0.05225,0.08363,0.06475,
			0.07575,0.05725,0.086,0.05225,0.08475,0.08613,0.08475,0.08113,0.08613,0.04975,0.05725,0.056,0.07675,0.06725,0.05475,0.08475,0.0685,0.056,0.07225,0.0535,0.056,0.08613,0.06725,0.085,0.081,0.07475,0.05225,0.05975,0.05225,0.05225,0.07863,0.0635,0.08363,0.07863,0.091,0.06225,0.09113,0.05725,0.08725,0.05225,0.08975,0.07225,0.08363,0.08613,0.056,0.07975,0.07308,0.08613,0.0685,0.0595,0.07113,0.076,0.05725,0.081,0.05725,0.0845,0.07863,0.061,0.09613,0.0785,0.07475,0.07825,0.07863,0.08613,0.0635,0.05725,0.0635,0.07475,0.08363,0.07725,0.09113,0.06725,0.07225,0.08363,0.06225,0.06225,0.08613,0.06975,0.0585,0.06225,0.06225,0.08725,0.08225,0.06725,0.08863,0.06225,0.07475,0.06475,0.066,0.07613,0.06725,0.08225,0.061,0.061,0.07475,0.07225,0.05225,0.08363,0.09475,0.0635,0.06725,0.06725,0.06725,0.10113,0.05975,0.08475,0.05975,0.06725,0.06725,0.085,0.05725,0.08613,0.07225,0.081,0.08113,0.06725,0.05725,0.09725,0.05225,0.056,0.05975,0.07725,0.07225,0.06725,0.0845,0.06725,0.07225,0.0735,0.05225,
			0.08725,0.0585,0.09113,0.08488,0.09113,0.0535,0.061,0.09113,0.06225,0.05225,0.09113,0.08613,0.085,0.07725,0.0535,0.08613,0.06225,0.07975,0.0835,0.06225,0.06425,0.0785,0.091,0.056,0.0595,0.08363,0.0935,0.06225,0.09113,0.08613,0.05725,0.08863,0.0535,0.0685,0.0735,0.056,0.07613,0.08363,0.05475,0.08113,0.05975,0.05891,0.05413,0.08475,0.066,0.07475,0.08225,0.06425,0.04975,0.09113,0.08475,0.07725,0.06975,0.061,0.07613,0.0785,0.06225,0.07613,0.0885,0.061,0.07475,0.06225,0.071,0.07475,0.0635,0.07225,0.07975,0.06975,0.09113,0.081,0.07975,0.07975,0.08363,0.06225,0.08363,0.08613,0.07613,0.05225,0.07225,0.08225,0.0535,0.06825,0.061,0.06725,0.09225,0.07613,0.0885,0.08363,0.09613,0.08363,0.07225,0.05162,0.06725,0.05825,0.085,0.06225,0.07225,0.066,0.08363,0.09113,0.09975,0.06225,0.05225,0.0685,0.07225,0.06725,0.0745,0.10113,0.05725,0.08475,0.08113,0.08363,0.07613,0.06225,0.05725,0.06225,0.10113,0.06475,0.0985,0.07613,0.06475,0.08475,0.06225,0.09113,0.05725,0.071,0.08363,0.0835,0.08113,
			0.081,0.07725,0.08363,0.086,0.07975,0.07113,0.071,0.08113,0.06475,0.06225,0.085,0.06413,0.06225,0.08113,0.07975,0.0785,0.05225,0.06725,0.07475,0.06475,0.07475,0.076,0.08975,0.05225,0.081,0.07475,0.08363,0.06475,0.0535,0.0585,0.0545,0.07475,0.08863,0.06475,0.05475,0.06975,0.08113,0.0685,0.07863,0.06725,0.08125,0.06975,0.0695,0.05413,0.09613,0.05225,0.08613,0.07475,0.05413,0.07225,0.061,0.10113,0.06225,0.066,0.08363,0.06425,0.08725,0.08363,0.05725,0.07475,0.06225,0.08863,0.06475,0.0885,0.08225,0.08725,0.05725,0.0795,0.08863,0.0795,0.08613,0.081,0.08975,0.07725,0.09113,0.091,0.066,0.081,0.09613,0.056,0.06725,0.07613,0.07288,0.08725,0.07725,0.08363,0.07113,0.08613,0.0535,0.07725,0.07613,0.0735,0.07475,0.07725,0.081,0.08225,0.08363,0.05975,0.0935,0.0835,0.061,0.08725,0.086,0.08113,0.07425,0.05475,0.08225,0.09113,0.07863,0.05225,0.09725,0.08725,0.07975,0.06475,0.061,0.08363,0.08475,0.09613,0.08613,0.07975,0.05725,0.05475,0.0685,0.061,0.0585,0.06308,0.07808,0.08613,0.06725,0.0735,
			0.086,0.066,0.05475,0.06975,0.08613,0.06475,0.0795,0.08475,0.06225,0.0595,0.061,0.061,0.061,0.07113,0.0935,0.05225,0.05725,0.06475,0.05725,0.05225,0.07325,0.076,0.07613,0.08988,0.07613,0.05225,0.05225,0.05975,0.07175,0.09363,0.07225,0.056,0.0795,0.08863,0.06225,0.07225,0.091,0.07225,0.07613,0.08863,0.06225,0.05725,0.08363,0.08475,0.08988,0.06975,0.07475,0.072,0.06913,0.06413,0.06225,0.056,0.08363,0.08613,0.06225,0.0785,0.07975,0.07475,0.08363,0.07225,0.0635,0.08225,0.05725,0.0685,0.05725,0.06225,0.05225,0.09863,0.05475,0.08225,0.0835,0.08863,0.0685,0.05725,0.056,0.05225,0.06725,0.05825,0.061,0.086,0.086,0.086,0.08363,0.08113,0.06225,0.09613,0.08613,0.076,0.08225,0.056,0.05975,0.08475,0.071,0.0885,0.081,0.091,0.0835,0.06225,0.07475,0.07975,0.10679,0.08363,0.056,0.08363,0.08975,0.091,0.08725,0.0885,0.08225,0.07225,0.0695,0.0795,0.08725,0.0785,0.08975,0.06225,0.0885,0.07975,0.0585,0.09679,0.0595,0.05725,0.04725,0.06225,0.06225,0.0835,0.0785,0.06225,0.061,0.066,0.0885,0.05225,
			0.0895,0.0885,0.07975,0.06975,0.0685,0.08363,0.07725,0.09679,0.08363,0.0835,0.06975,0.06725,0.08725,0.05725,0.08363,0.05225,0.08225,0.09225,0.09679,0.061,0.0785,0.07413,0.06475,0.0885,0.08475,0.05162,0.06725,0.061,0.0585,0.056,0.07613,0.06225,0.09679,0.061,0.06225,0.0595,0.07225,0.056,0.08113,0.08225,0.06475,0.05975,0.05725,0.0795,0.10679,0.05225,0.06725,0.06725,0.06975,0.081,0.06975,0.056,0.08363,0.05413,0.08613,0.0835,0.04725,0.05725,0.056,0.07475,0.071,0.0995,0.08225,0.08413,0.06725,0.0895,0.07475,0.08613,0.08225,0.06225,0.05225,0.06225,0.08363,0.05975,0.0535,0.101,0.076,0.06475,0.05225,0.05225,0.06225,0.086,0.08975,0.08613,0.05225,0.06725,0.07725,0.06475,0.09975,0.08225,0.09679,0.05225,0.08613,0.0895,0.06475,0.07225,0.06475,0.08113,0.05975,0.09613,0.07613,0.08975,0.0895,0.056,0.09363,0.07725,0.081,0.06725,0.0885,0.05725,0.05225,0.06975,0.09679,0.07725,0.09679,0.0785,0.081,0.08475,0.0895,0.06725,0.07613,0.08225,0.0895,0.07975,0.0785,0.0895,0.05225,0.08725,0.061,0.0835,
			0.096,0.07725,0.05725,0.0545,0.066,0.0795,0.07225,0.05725,0.08475,0.06725,0.06975,0.07475,0.09613,0.07725,0.09613,0.06725,0.0885,0.05162,0.06225,0.07808,0.0735,0.0685,0.06975,0.05225,0.06475,0.08363,0.06725,0.05475,0.076,0.07613,0.05725,0.06225,0.08363,0.09475,0.0735,0.06475,0.08113,0.076,0.0545,0.07725,0.086,0.06475,0.07975,0.06225,0.091,0.07225,0.09679,0.06975,0.08113,0.081,0.10679,0.09225,0.061,0.08475,0.06725,0.07475,0.08225,0.05475,0.05975,0.07725,0.06225,0.08363,0.08725,0.06725,0.06725,0.0895,0.052,0.0935,0.05475,0.061,0.0795,0.06475,0.05725,0.05225,0.06225,0.05225,0.08225,0.071,0.08363,0.08363,0.09679,0.08725,0.08613,0.0785,0.08975,0.066,0.05225,0.061,0.066,0.0635,0.05162,0.08975,0.08363,0.07975,0.08363,0.05225,0.07475,0.091,0.06725,0.0895,0.06225,0.08113,0.0685,0.07475,0.0885,0.05162,0.04975,0.08613,0.07725,0.08725,0.06725,0.09363,0.05225,0.08363,0.07725,0.0645,0.081,0.07225,0.08225,0.06975,0.06475,0.08558,0.06225,0.0735,0.08613,0.08863,0.06225,0.06225,0.0885,0.07725,
			0.08475,0.0735,0.08475,0.0745,0.08363,0.061,0.076,0.07975,0.05725,0.07975,0.0585,0.06725,0.07975,0.06725,0.086,0.07475,0.07725,0.06475,0.08975,0.091,0.07725,0.05225,0.06725,0.06725,0.07725,0.06225,0.08725,0.0835,0.0685,0.076,0.0835,0.08725,0.08975,0.071,0.05725,0.05725,0.06225,0.061,0.08363,0.076,0.08975,0.05975,0.08113,0.06225,0.066,0.0585,0.0795,0.08363,0.0835,0.066,0.081,0.08113,0.05225,0.05475,0.061,0.061,0.05475,0.07725,0.0535,0.07725,0.0535,0.08613,0.08725,0.06225,0.07475,0.0885,0.07725,0.086,0.08613,0.08363,0.08363,0.09225,0.08413,0.0835,0.07613,0.07475,0.07162,0.0735,0.08363,0.0545,0.06725,0.0735,0.0895,0.061,0.08225,0.06225,0.07725,0.09679,0.09113,0.05225,0.061,0.0835,0.071,0.0695,0.06725,0.056,0.09475,0.07225,0.07975,0.061,0.05162,0.0885,0.05475,0.07113,0.07475,0.07975,0.081,0.08225,0.08425,0.06725,0.08725,0.09113,0.08075,0.0795,0.07975,0.07225,0.09975,0.08475,0.06225,0.07725,0.05975,0.09679,0.06475,0.05725,0.09679,0.07225,0.06725,0.08613,0.06225,0.06725,0.0545,
			0.07225,0.08725,0.06725,0.056,0.087,0.08975,0.071,0.061,0.09679,0.071,0.08225,0.05225,0.07225,0.09475,0.061,0.07613,0.08475,0.081,0.06225,0.06225,0.05725,0.08363,0.0735,0.05225,0.06725,0.081,0.0885,0.05675,0.09613,0.05975,0.05825,0.05475,0.0895,0.09679,0.061,0.05225,0.08113,0.09225,0.05725,0.08225,0.05975,0.08613,0.06725,0.06225,0.10679,0.06413,0.08113,0.05725,0.06725,0.05725,0.0635,0.10679,0.0535,0.08975,0.06725,0.061,0.07225,0.07725,0.09679,0.05413,0.09363,0.06725,0.06425,0.091,0.10679,0.06225,0.06225,0.09225,0.07975,0.07975,0.08225,0.0785,0.086,0.056,0.08475,0.08225,0.06725,0.09113,0.08113,0.0785,0.086,0.081,0.096,0.0885,0.06975,0.06725,0.08363,0.056,0.06975,0.09113,0.08225,0.0895,0.066,0.05725,0.06225,0.07225,0.08975,0.0735,0.06225,0.0895,0.087,0.08475,0.05725,0.06225,0.086,0.06475,0.09975,0.05225,0.06725,0.09225,0.10679,0.08113,0.08225,0.05725,0.05975,0.0785,0.05725, 0.061,0.07225,0.06725,0.07225,0.09679,0.08613,0.066,0.086,0.08613,0.08725,0.06225,0.08613,0.08225,0.05225,
			0.09613,0.07975,0.07225,0.06725,0.071,0.07725,0.0745,0.05975,0.101,0.06975,0.07225,0.07725,0.08225,0.0685,0.0895,0.09613,0.05725,0.08975,0.08113,0.076,0.08363,0.06725,0.07975,0.09475,0.06475,0.08363,0.06725,0.0685,0.096,0.08363,0.07225,0.06225,0.0895,0.06725,0.06975,0.06225,0.0585,0.05725,0.05475,0.08475,0.06225,0.08613,0.076,0.06225,0.0835,0.08613,0.06225,0.0785,0.0935,0.08113,0.06975,0.091,0.07975,0.0885,0.071,0.08975,0.07613,0.0735,0.08475,0.091,0.10679,0.05725,0.086,0.06725,0.06475,0.061,0.08725,0.091,0.076,0.08475,0.0735,0.05413,0.06475,0.08975,0.08975,0.08225,0.05975,0.09679,0.06725,0.0885,0.09475,0.06475,0.08725,0.05725,0.05225,0.056,0.06975,0.09225,0.06475,0.08975,0.08363,0.06975,0.061,0.0935,0.06725,0.09679,0.09363,0.061,0.05725,0.086,0.06975,0.05475,0.076,0.086,0.08225,0.08475,0.08975,0.07725,0.06225,0.06975,0.07725,0.05725,0.05725,0.08363,0.06475,0.09679,0.05225,0.05725,0.07225,0.06225,0.06225,0.06425,0.07725,0.061,0.08225,0.0885,0.0735,0.07225,0.061,0.06725,0.08238,
			0.07225,0.05975,0.06475,0.06725,0.07225,0.05725,0.05475,0.06725,0.07613,0.10613,0.061,0.09725,0.06225,0.09225,0.05725,0.07613,0.05225,0.08975,0.08975,0.09475,0.06475,0.08613,0.091,0.06725,0.05725,0.0835,0.06663,0.08575,0.061,0.05725,0.08475,0.05225,0.08363,0.0585,0.08225,0.086,0.102,0.08363,0.081,0.097,0.09725,0.0595,0.066,0.06975,0.09363,0.0985,0.08413,0.08225,0.06225,0.0885,0.0535,0.08975,0.07475,0.06475,0.07613,0.06475,0.08225,0.08975,0.08725,0.06725,0.0585,0.06225,0.08975,0.06225,0.08613,0.06725,0.05725,0.06725,0.06225,0.06725,0.0585,0.05975,0.07225,0.08725,0.08363,0.08363,0.07725,0.061,0.08975,0.07475,0.0635,0.081,0.07975,0.0835,0.071,0.08363,0.06225,0.05225,0.05725,0.06725,0.08975,0.056,0.056,0.061,0.07808,0.06225,0.08475,0.071,0.09179,0.07613,0.05413,0.09475,0.06413,0.081,0.07225,0.071,0.10679,0.05225,0.086,0.08058,0.07613,0.10679,0.0895,0.06725,0.06725,0.0785,0.08363,0.06725,0.0885,0.07225,0.07725,0.0685,0.05725,0.066,0.0895,0.04975,0.086,0.056,0.071,0.0685,0.076,0.066,
			0.06725,0.0785,0.06225,0.07475,0.07225,0.0535,0.091,0.05475,0.06225,0.06225,0.0835,0.05725,0.07975,0.06475,0.0795,0.06725,0.06225,0.06425,0.0685,0.0845,0.06475,0.08613,0.08363,0.071,0.0595,0.09679,0.07725,0.06225,0.09113,0.07975,0.05725,0.08363,0.05413,0.07975,0.0835,0.09679,0.06725,0.0535,0.07475,0.08475,0.10679,0.06225,0.05825,0.08975,0.0785,0.07113,0.07975,0.07925,0.09225,0.05413,0.08363,0.08613,0.06725,0.06475,0.07725,0.091,0.097,0.08308,0.081,0.05725,0.10679,0.081,0.05975,0.09975,0.04725,0.05725,0.06225,0.076,0.081,0.091,0.06725,0.06225,0.07613,0.05225,0.07675,0.08725,0.076,0.10679,0.101,0.06225,0.0835,0.0935,0.081,0.07975,0.0545,0.06725,0.06225,0.06975,0.09225,0.0635,0.07975,0.07725,0.07725,0.08363,0.05725,0.07613,0.08725,0.08575,0.05725,0.07475,0.061,0.06225,0.09679,0.05413,0.08975,0.08225,0.086,0.05162,0.08225,0.06725,0.071,0.0885,0.05225,0.0635,0.05975,0.07725,0.05475,0.0685,0.05725,0.05225,0.04975,0.06475,0.07613,0.08363,0.08113,0.08613,0.0895,0.06975,0.076,0.08225,
			0.08225,0.08475,0.08725,0.05975,0.05725,0.09679,0.0885,0.08679,0.05225,0.0585,0.06225,0.07225,0.066,0.0685,0.0685,0.071,0.06725,0.0535,0.06725,0.08225,0.081,0.056,0.08225,0.10163,0.08975,0.06925,0.05225,0.08725,0.081,0.061,0.06225,0.08975,0.08975,0.071,0.05975,0.0735,0.066,0.07725,0.05475,0.07725,0.08363,0.06225,0.06725,0.076,0.061,0.061,0.08613,0.0945,0.07725,0.061,0.0745,0.06975,0.07863,0.071,0.06725,0.06975,0.06225,0.0845,0.061,0.086,0.08113,0.04975,0.087,0.04725,0.09238,0.05891,0.0735,0.05225,0.091,0.07725,0.07975,0.07613,0.08162,0.08225,0.07175,0.07613,0.056,0.0535,0.056,0.05225,0.06475,0.07725,0.05975,0.07475,0.08613,0.08225,0.0645,0.06975,0.07475,0.0535,0.08613,0.07975,0.07475,0.09225,0.0635,0.06912,0.06225,0.08113,0.07162,0.06725,0.06725,0.06475,0.06475,0.07225,0.07725,0.07613,0.056,0.091,0.07225,0.066,0.05725,0.087,0.07975,0.05475,0.0595,0.08162,0.06725,0.0835,0.0585,0.07225,0.06725,0.0895,0.05975,0.061,0.0885,0.07613,0.05725,0.05725,0.0835,0.06225,0.0835,0.06475,0.0695,
			0.076,0.056,0.06225,0.05975,0.06225,0.07975,0.07725,0.07113,0.08225,0.05225,0.06225,0.08225,0.05975,0.08863,0.06475,0.07662,0.07891,0.0785,0.07975,0.0795,0.07225,0.0895,0.06725,0.07613,0.06475,0.061,0.0545,0.07613,0.07725,0.05725,0.07475,0.08975,0.0835,0.08363,0.06475,0.0895,0.06975,0.08725
		};
        
		
		System.out.println("Welcome to the Sorting Tester");
     
		System.out.println("This program demonstrates different sorting methods"
 + " and their effciencies using Missouri County Sales Tax Data");
        
		CountyTax[] counties = new CountyTax[taxRate.length];
        
		for(int i = 0; i < counties.length; i++) 
		{

       			counties[i] = new CountyTax(taxRate[i], county[i]);

		}
    
	 //   bubbleSort(counties);
    
	//   insertionSort(counties);
    
	 //   selectionSort(counties);
    
	//    mergeSort(counties);
    
	    quickSort(counties);
    
	}
    
    // bubble sort function/method
	public static void bubbleSort(CountyTax[] original) 
	{
			// copy the elements of array named "original" into an array named "sorted"
    		CountyTax[] sorted = Arrays.copyOf(original, original.length);
    		//noting the current time before running the implementation
    		long startTime = System.currentTimeMillis();
    		// temporary variable of type CountyTax to swap the elements of array
        	CountyTax temp;
 
        	boolean swap = false;
        	// loop for sorting the elements of array in ascending order
        	for (int i = 0; i < sorted.length - 1; i++)
        	{
 
        		swap = false;
 
            		for (int j = 0; j < sorted.length - i - 1; j++)
            		{
 
            			if (sorted[j].getTax() > sorted[j + 1].getTax())
            			{
            				// swapping elements
            					temp = sorted[j];
                    			sorted[j] = sorted[j + 1];
                    			sorted[j + 1] = temp;
	    
                    			swap = true;
	 
            			}   
            		}
   
            		if (swap == false) 
                		break;        
        	} 
        	// printing the sorted array
        	printArray(sorted);
        	//noting the current time after running the implementation
    		long endTime = System.currentTimeMillis();
    		// printing the time taken by the bubblesort
    		System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
    	
    		System.out.println("Sort finished.");	
	}
       
	public static void insertionSort(CountyTax[] original) 
	{
    	
		CountyTax[] sorted = Arrays.copyOf(original, original.length);
    	
		long startTime = System.currentTimeMillis();
    	
		for (int i = 1; i < sorted.length; ++i) 
		{ 
            	
			CountyTax key = sorted[i]; 
            
			int j = i - 1; 
            
			while (j >= 0 && sorted[j].getTax() > key.getTax()) 
			{ 
                
				sorted[j + 1] = sorted[j]; 
                
				j = j - 1; 
            
			} 
            
			sorted[j + 1] = key; 
        
		} 
    	
		printArray(sorted);
    	
		long endTime = System.currentTimeMillis();
    	
		System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
    	
		System.out.println("Sort finished.");
    
	}
    
    
	public static void selectionSort(CountyTax[] original) 
	{
    	
		CountyTax[] sorted = Arrays.copyOf(original, original.length);
    	
		long startTime = System.currentTimeMillis();
    	
		int n = sorted.length;
    	
		for(int i = 0; i < n-1; i++) 
		{
    		
			int min_idx = i;
    		
			for(int j = i + 1; j < n; j++) 
			{
    			
				if(sorted[j].getTax() < sorted[min_idx].getTax()) 
				{
    				
					min_idx = j;
    			
				}
    		
			}
    		
			CountyTax temp = sorted[min_idx]; 
    		
			sorted[min_idx] = sorted[i]; 
    		
			sorted[i] = temp; 
    	
		}
    	
    	
		printArray(sorted);
    	
		long endTime = System.currentTimeMillis();
    	
		System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
    	
		System.out.println("Sort finished.");
    
	}
    
    
	public static void mergeSort(CountyTax[] original) 
	{
    	
		CountyTax[] sorted = Arrays.copyOf(original, original.length);
    	
		long startTime = System.currentTimeMillis();
    	
		mergeSortSort(sorted, sorted.length);
    	
		printArray(sorted);
    	
		long endTime = System.currentTimeMillis();
    	
		System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
    	
		System.out.println("Sort finished.");
    
	}
    
    
	private static void mergeSortSort(CountyTax[] sorted, int n) 
	{
    	
		if (n < 2) 
		{
            
			return;
        
		}
        
		int mid = n / 2;
        
		CountyTax[] l = new CountyTax[mid];
        
		CountyTax[] r = new CountyTax[n - mid];
     
        
		for (int i = 0; i < mid; i++) 
		{
            
			l[i] = sorted[i];
        
		}
        
		for (int i = mid; i < n; i++) 
		{
            
			r[i - mid] = sorted[i];
        
		}
        
		mergeSortSort(l, mid);
        
		mergeSortSort(r, n - mid);
     
        
		mergeSortMerge(sorted, l, r, mid, n - mid);
	
	}
    
    
	private static void mergeSortMerge(CountyTax[] sorted, CountyTax[] l, CountyTax[] r, int left, int right) 
	{
    	
		int i = 0;
    	
		int j = 0;
    	
		int k = 0;
        
		while (i < left && j < right) 
		{
            
			if (l[i].getTax() <= r[j].getTax()) 
			{
                
				sorted[k++] = l[i++];
            
			}
            
			else 
			{
                
				sorted[k++] = r[j++];
            
			}
        
		}
        
		while (i < left) 
		{
            
			sorted[k++] = l[i++];
        
		}
        
		while (j < right) 
		{
            
			sorted[k++] = r[j++];
        
		}
        
	
	}
    
    
	public static void quickSort(CountyTax[] original) 
	{
    	
		CountyTax[] sorted = Arrays.copyOf(original, original.length);
    	
		long startTime = System.currentTimeMillis();
    	
		quickSortSort(sorted, 0, sorted.length - 1);
    	
		printArray(sorted);
    	
		long endTime = System.currentTimeMillis();
    	
		System.out.println("This sort took: " + ((double)endTime - startTime)/1000 + " seconds");
    	
		System.out.println("Sort finished.");
    
	}
    
    
	private static void quickSortSort(CountyTax[] sorted, int i, int j) 
	{
		
		if(i < j) 
		{
			
			int part = partition(sorted, i, j);
			
			quickSortSort(sorted, i, part - 1);
			
			quickSortSort(sorted, part + 1, j);
		
		}
		
	
	}

	
	private static int partition(CountyTax[] sorted, int low, int high) 
	{
		
		double pivot = sorted[high].getTax();
		
		int i = low - 1;
		
		for(int j = low; j < high; j++) 
		{
			
			if(sorted[j].getTax() < pivot) 
			{
				
				i++;
				
				CountyTax temp = sorted[i]; 
				
				sorted[i] = sorted[j]; 
                
				sorted[j] = temp; 
			
			}
		
		}
		
		CountyTax temp = sorted[i+1]; 
        
		sorted[i+1] = sorted[high]; 
        
		sorted[high] = temp; 
  
        
		return i+1; 
		
	
	}

    
    
	private static void printArray(CountyTax[] original) 
	{
    	
		for(int i = 0; i < original.length; i++) 
		{
    		
			System.out.println(original[i].getCounty() + " has tax rate " + original[i].getTax() + "%");
    	
		}
    
	}

}
