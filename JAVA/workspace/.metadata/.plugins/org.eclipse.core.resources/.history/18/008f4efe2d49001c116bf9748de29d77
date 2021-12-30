package dao;

import java.util.ArrayList;
import java.util.HashSet;

import dto.ProductDTO;

public class ProductDAO {
	DBConnection conn = null;
	public ProductDAO() {
		conn = new DBConnection("ProductTable.txt");
	}
	
	public int getLastNum() {
		String lastPk = conn.lastPK();
		if(lastPk == null) {
			return 0;
		}else {
			return Integer.parseInt(lastPk);
		}
	}
	
	public boolean addProduct(ProductDTO newProduct) {
		return conn.insert(newProduct.toString());
	}

	public String getList(String userid) {
		HashSet<String> rs = conn.select(6, userid);
		String result = "";
		//1. 지우개 : 10000원(재고 : 3개)
		for(String line : rs) {
			String[] datas = line.split("\t");
//			result += datas[0]+". "+datas[1]+" : "
//					+datas[2]+"원(재고 : "+datas[3]+"개)";
			result += String.format("%s. %s : %s원(재고 : %s개)\n",
					datas[0],datas[1],datas[2],datas[3]);
		}
		return result;
	}

	public boolean modifyProduct(int prodnum, int choice, String newData) {
		return conn.update(prodnum+"", choice, newData);
	}

	public boolean removeProduct(int prodnum) {
		return conn.delete(prodnum+"");
	}

	public String search(String keyword) {
		HashSet<String> rs = conn.select();
		ArrayList<String> result = new ArrayList<String>();
		for(String line : rs) {
			String[] datas = line.split("\t");
			//"문자열1".contains("문자열2") : 문자열1에 문자열2가 포함되어 있으면 true
			if(datas[1].contains(keyword)) {
				result.add(line);
			}else if(datas[4].contains(keyword)) {
				result.add(line);
			}
		}
		//"지우개"로 검색된 결과
		String resultMsg = "\""+keyword+"\"로 검색된 결과\n";
		if(result.size() == 0) {
			resultMsg+="해당하는 상품이 없습니다\n";
		}else {
			for(String line : result) {
				String[] datas = line.split("\t");
				resultMsg += String.format("%s. %s : %s원(재고 : %s개) - %s\n",
						datas[0],datas[1],datas[2],datas[3],datas[6]);
			}
		}
		return resultMsg;
		
	}

	public void removeAll(String userid) {
		HashSet<String> rs = conn.select(6,userid);
		for(String line : rs) {
			conn.delete(line.split("\t")[0]);
		}
	}
}












