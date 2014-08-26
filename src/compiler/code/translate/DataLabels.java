package compiler.code.translate;

import java.util.ArrayList;

public class DataLabels {

	private static ArrayList<String> dataLabels = new ArrayList<String>();
	private static int labelindex = 0;
	
	public DataLabels() {

	}

	/**
	 * @return the dataLabels
	 */
	public static StringBuffer getDataLabels() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < dataLabels.size(); i++){
			sb.append(dataLabels.get(i) + "\n" );
		}
		return sb;		
	}

	/**
	 * @param dataLabels the dataLabels to set
	 */
	public static void setDataLabels(ArrayList<String> dataLabels) {
		DataLabels.dataLabels = dataLabels;
	}


	public static void addlabelData(String dataLabel){
		DataLabels.dataLabels.add(dataLabel);
	}

	public static String generateLabel(){
		DataLabels.labelindex++;
		return "string" + DataLabels.labelindex;
	}
}
