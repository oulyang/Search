package m3d8;

public class SeqSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {121,44,1234,221,41};
		int index=SeqSearch.seqSearch(arr,44);
		if(index==-1) {
			System.out.println("û�ҵ�");
		}else {
			System.out.println("�ҵ��ˣ��±���"+index);
		}

	}
	//���Բ���
	//ֻ�ҵ�һ���ͷ���
	public static int seqSearch(int[] arr,int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}
}
