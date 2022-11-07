#include <iostream>

using namespace std;
// 选择排序
void selectionSort(int arr[], int size) {

  for (int i = 0; i < size; ++i) {

    // 每一轮寻找 [i, size) 区间最小的数，然后确保 i 的位置是最小的
    int minIndex = i;
    for (int j = i + 1; j < size; ++j) {
      if (arr[minIndex] > arr[j]) { // 拿着 arr[i] 和后面所有的元素比较
        // 交换
        minIndex = j;
      }
    }
    swap(arr[minIndex], arr[i]); // 一轮比较完后，把最小的数放在 i 位置上
  }
}

int main(){

  cout << "selection sort.." << endl;
  int arr[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
  selectionSort(arr, 10);
  for (int i = 0; i < 10; ++i) {
    cout << arr[i] << ", ";
  }
  cout << endl;
  return 0;
}