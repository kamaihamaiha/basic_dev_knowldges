//
// Created by 张开旭 on 2022/11/11.
//

#ifndef DATA_STRUCT_AND_ALGORITHM_SELECTIONSORT_STUDENT_H_
#define DATA_STRUCT_AND_ALGORITHM_SELECTIONSORT_STUDENT_H_

#include <iostream>
#include <string>

using namespace std;

struct Student {
  string name;
  int score;

  bool operator<(const Student &otherStudent) {
    return score < otherStudent.score;
  }

  friend ostream& operator<<(ostream &os, const Student &student) {
    os<<"Student: "<<student.name<<", "<<student.score<<endl;
    return os;
  }
};

#endif //DATA_STRUCT_AND_ALGORITHM_SELECTIONSORT_STUDENT_H_
