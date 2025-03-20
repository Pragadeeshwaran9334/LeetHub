class Solution {
    class DisjointSet{
        int[] parent,size,res;
        public DisjointSet(int n){
            this.parent = new int[n];
            this.size = new int[n];
            this.res = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
                size[i] = 1;
                res[i] = Integer.MAX_VALUE;
            }
        }
        public int findParent(int ch){
            if(parent[ch] == ch)
            return ch;
            return parent[ch] = findParent(parent[ch]);
        }
        public void union(int a,int b,int edge){
            int pa = findParent(a);
            int pb = findParent(b);
            if(pa == pb){
                res[pa] = res[pa]&edge;
            }
            else{
                int sa = size[pa];
                int sb = size[pb];
                if(sa >= sb){
                    parent[pb] = pa;
                    size[pa] += size[pb];
                    res[pa] = (res[pa]&edge)&res[pb];
                }
                else{
                    parent[pa] = pb;
                    size[pb] += size[pa];
                    res[pb] = (res[pb]&edge)&res[pa];
                }
            }
        }
    }
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DisjointSet ds = new DisjointSet(n);
        for(int[] row : edges){
            ds.union(row[0],row[1],row[2]);
        }
        int[] ans = new int[query.length];
        for(int i=0;i<query.length;i++){
            int a = query[i][0];
            int b = query[i][1];
            int pa = ds.findParent(a);
            int pb = ds.findParent(b);
            if(pa == pb){
                ans[i] = ds.res[pa];
            }
            else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}