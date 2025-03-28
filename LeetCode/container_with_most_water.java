class container_with_most_water {
    public int maxArea(int[] height) {
        //--------------------O(n)
        int start = 0;
        int end = height.length - 1;
        int area;
        int maxarea = 0;
        while (start < end) {
            area = Math.min(height[start], height[end]) * (end - start);
            if (area > maxarea) {
                maxarea = area;
            }

            // if(Math.min(height[start],height[end]) == height[start])
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxarea;
        //////////////////////////////////----O(n^2)
        // int end=height.length-1;
        // int area;
        // int maxarea=0;
        // for(int i=0;i<end;i++)
        // {
        // for(int j=i+1;j<height.length;j++)
        // {

        // area=Math.min(height[i],height[j])*(j-i);
        // if(area>maxarea)
        // {
        // maxarea=area;
        // }
        // }
        // }
        // return maxarea;
    }

    public static void main(String[] args) {
        container_with_most_water cmw = new container_with_most_water();
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int height = cmw.maxArea(arr);
        System.out.println("Maximum Height is :- " + height);

    }
}
