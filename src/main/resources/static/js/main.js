$(document).ready(function() {

    $('.table .eBtn').on('click',function(event){

        $('.myForm #id').val($(this).data('id'));
        $('.myForm #name').val($(this).data('name'));
        $('.myForm #capital').val($(this).data('capital'));

        $('.myForm #exampleModal').modal();
       // $('#exampleModal').modal('show');
    });

    $('#addbtn').on('click',function(event){

        $('.myForm #exampleModal').modal();
    });
    $('#closebtn').on('click',function(event){

        $('.myForm #exampleModal').modal('hide');
    });

});