const searchInsert = (nums, target) => {
    let start = 0;
let end = nums.length -1;
if (target < nums[0]) {
    return 0
} else if (target > nums[end]) {
    return end +1
}
while(start<= end){
    let mid = Math.floor((start+end)/2)
    if(target < nums[mid]){
        end = mid -1
    }else if(target>nums[mid]){
        start = mid +1;
    }else{
        return mid
    }
}
return start
};

const testSearchInsert = () => {
    let nums = [1, 3, 5, 6];
    let target = 5;
    let expected = 2;
    let result = searchInsert(nums, target);
    console.log(result === expected ? "PASS" : "FAIL");
}

testSearchInsert();