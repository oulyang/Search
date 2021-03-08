package m3d8;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,4,4,5,6,7};
		//使用二分查找必须是有序数组
		
		/*
		int index=binarySearch(arr,1,arr.length,4);
		if(index==-1) {
			System.out.println("没找到");
		}else {
			System.out.println("找到了，下标是"+index);
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

		if(value>midValue) {//向右递归
			return binarySearch(arr,mid+1,right,value);
		}else if(value<midValue) {//向左递归
			return binarySearch(arr,left,mid-1,value);
		}else {
			return mid;
		}
	}
	
	//如果数组中要找的元素有多个
	//找到mid先不返回，向mid左右两边扫描，将符合的元素加入集合中，再将集合返回
	public static ArrayList<Integer> binarySearch2(int[] arr,int left,int right,int value) {
		int mid=(left+right)/2;
		int midValue=arr[mid];

		if(left>right) {
			return new ArrayList<Integer>();
		}

		if(value>midValue) {//向右递归
			return binarySearch2(arr,mid+1,right,value);
		}else if(value<midValue) {//向左递归
			return binarySearch2(arr,left,mid-1,value);
		}else {
			
			
			ArrayList<Integer> indexList=new ArrayList<>();
			//左边扫描
			int temp=mid-1;
			while(true) {
				if(temp<0||arr[temp]!=value) {
					break;
				}
				indexList.add(temp);
				temp--;

			}
			indexList.add(mid);
			
			//右边扫描
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
