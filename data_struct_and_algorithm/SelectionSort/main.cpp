#include <iostream>
#include "Student.h"

using namespace std;
// 选择排序
template<typename T>
void selectionSort(T arr[], int size) {

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
  // int 数组排序
  int arr[10] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
  selectionSort(arr, 10);
  for (int i = 0; i < 10; ++i) {
    cout << arr[i] << ", ";
  }
  cout << endl;

  // float 数组排序
  float arr_f[10] = {10.2, 9.3, 8.9, 7.1, 6.4, 5.4, 4, 3, 2, 1};
  selectionSort(arr_f, 10);
  for (int i = 0; i < 10; ++i) {
    cout << arr_f[i] << ", ";
  }
  cout << endl;

  // string 数组排序
  string arr_s[4] = {"d", "c", "b", "a"};
  selectionSort(arr_s, 4);
  for (int i = 0; i < 4; ++i) {
    cout << arr_s[i] << ", ";
  }
  cout << endl;

  // 比较自定义类型的数组. 操作符重载出问题了，不知道如何改
  Student sd[4] = {{"D", 90}, {"C", 100}, {"B", 95}, {"A", 95}, };
//  selectionSort(sd, 4);
  /*for (int i = 0; i < 4; ++i) {
    cout << sd[i];
  }
  cout << endl;*/
  return 0;
}