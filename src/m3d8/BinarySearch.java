package m3d8;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,4,4,5,6,7};
		//ʹ�ö��ֲ��ұ�������������
		
		/*
		int index=binarySearch(arr,1,arr.length,4);
		if(index==-1) {
			System.out.println("û�ҵ�");
		}else {
			System.out.println("�ҵ��ˣ��±���"+index);
		}
		*/
		List<Integer> ls=binarySearch2(arr,0,arr.length-1,4);
		System.out.println(ls);
		
	}

	public static int binarySearch(int[] arr,int left,int right,int value) {
		int mid=(left+right)/2;
		int midValue=arr[mid];

		if(left>right) {
			return -1;
		}

		if(value>midValue) {//���ҵݹ�
			return binarySearch(arr,mid+1,right,value);
		}else if(value<midValue) {//����ݹ�
			return binarySearch(arr,left,mid-1,value);
		}else {
			return mid;
		}
	}
	
	//���������Ҫ�ҵ�Ԫ���ж��
	//�ҵ�mid�Ȳ����أ���mid��������ɨ�裬�����ϵ�Ԫ�ؼ��뼯���У��ٽ����Ϸ���
	public static ArrayList<Integer> binarySearch2(int[] arr,int left,int right,int value) {
		int mid=(left+right)/2;
		int midValue=arr[mid];

		if(left>right) {
			return new ArrayList<Integer>();
		}

		if(value>midValue) {//���ҵݹ�
			return binarySearch2(arr,mid+1,right,value);
		}else if(value<midValue) {//����ݹ�
			return binarySearch2(arr,left,mid-1,value);
		}else {
			
			
			ArrayList<Integer> indexList=new ArrayList<>();
			//���ɨ��
			int temp=mid-1;
			while(true) {
				if(temp<0||arr[temp]!=value) {
					break;
				}
				indexList.add(temp);
				temp--;

			}
			indexList.add(mid);
			
			//�ұ�ɨ��
			temp=mid+1;
			while(true) {
				if(temp>arr.length-1||arr[temp]!=value) {
					break;
				}
				indexList.add(temp);
				temp++;
			}	
			return indexList;
		}
	}
}
