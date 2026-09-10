const students = [
    { name: "Alex", marks: 85 },
    { name: "Sam", marks: 72 },
    { name: "John", marks: 45 }
];

function checkResult(student) {

    if (student.marks >= 50) {
        console.log(`${student.name}: Pass`);
    } else {
        console.log(`${student.name}: Fail`);
    }
}

for (let i = 0; i < students.length; i++) {
    checkResult(students[i]);
}