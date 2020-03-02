import Vue from 'vue'

var tsApi = Vue.resource('/ts{/id}');

Vue.component('mess-list', {
    props:['messages'],
    template: '<div><div v-for="message in messages">{{message.text}}</div></div>',
    create: function () {
        tsApi.get().then(res=>                     //promise отправляет запрос к серверу
        console.log(res))
    }
});

var app = new Vue({
    el: '#app',
    template:'<mess-list :messages="messages"/>',
    data: {
        messages: []
    }
});