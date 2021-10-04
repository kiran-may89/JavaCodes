import java.util.*

fun main(args:Array<String>){
    val input:IntArray = intArrayOf(2,7,11,15)
    val target = 9
    print(twoSum(input, target).contentToString())

}
fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in nums.indices ){
        for (j in i+1 until  nums.size){
            if(nums[i] == target-nums[j] ){
                println("${nums[i]} i value and j values is ${target-nums[j]}")
                return intArrayOf(nums[i],nums[j])

            }

        }
    }
    return intArrayOf()
}