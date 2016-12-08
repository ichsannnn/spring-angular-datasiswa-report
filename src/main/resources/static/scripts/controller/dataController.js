angular.module('dataSiswa')
        .controller('dataController', function ($scope, dataService) {
            $scope.isDataEdit = false;
            $scope.currentSiswa = {};
            $scope.showData = function () {
                dataService.getDataFromDb().success(function (data) {
                    $scope.dataServer = data.content;
                })
            }
            
            $scope.saveData = function (data) {
                if ($scope.isDataEdit == true) {
                    dataService.updateDataFromDb(data.id, data).success(function (data) {
                        alert ("Data berhasil diubah")
                        $scope.clearData();
                    }).error(function () {
                        alert ("Terjadi kesalahan saat mengubah data")
                    })
                } else {
                    dataService.saveDataToDb(data).success(function (data) {
                        alert ("Data berhasil disimpan")
                        $scope.clearData();
                    }).error(function () {
                        alert ("Terjadi kesalahan saat menyimpan data")
                    })
                }
            }
            
            $scope.deleteData = function (id) {
                dataService.deleteDataFromDb(id).success(function (data) {
                    alert ("Data berhasil dihapus")
                    $scope.clearData();
                }).error(function () {
                    alert ("Terjadi kesalahan saat menghapus data")
                })
            }
            
            $scope.editData = function (data) {
                $scope.isDataEdit = true;
                $scope.currentSiswa = {};
                $scope.currentSiswa.id = data.id;
                $scope.currentSiswa.nis = data.nis;
                $scope.currentSiswa.nama = data.nama;
                $scope.currentSiswa.kelas = data.kelas;
            }
            
            $scope.clearData = function () {
                $scope.isDataEdit = false;
                $scope.currentSiswa = {};
                $scope.reloadData();
            }
            
            $scope.reloadData = function () {
                dataService.getDataFromDb().success(function (data) {
                    $scope.dataServer = data.content;
                })
            }
})