angular.module('dataSiswa')
        .factory('dataService', function ($http) {
            return {
                saveDataToDb: function (data) {
                    return $http.post("/siswa", data);
                },
                
                getDataFromDb: function () {
                    return $http.get("/siswa");
                },
                
                deleteDataFromDb: function (id) {
                    return $http.delete("/siswa/"+id);
                },
                
                updateDataFromDb:function (id, data) {
                    return $http.put("/siswa/"+id, data);
                }
            }
})