        int[] arr = {3,4,5,6,7,8,9};
        int[] a = twoSum(arr,15);
        System.out.print("[\t");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.print("]");
    }
//在leetCode 上用的 是没有static 的 为啥非要带上
    // 如果不用static  会报错  无法调用twoSum 这个函数。
    public static int[]twoSum(int[] nums, int target) {
        int[] a  = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                a[0] = map.get(nums[i]);
                a[1]= i;
                break;
            }
            map.put(target- nums[i],i);
        }
        return a;
    }
}

