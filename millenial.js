var ctx = document.getElementById('millenial-chart');
var myChart = new Chart(ctx, {
    type: 'pie',
    data: {
        labels: [
            'Blacked Eyed Peas',
            'Lady Gaga',
            'Chris Brown',
            'Kelly Clarkson',
            'Britney Spears',
            'Far East Movement',
            'Macklemore & Ryan Lewis',
            'Pitbull',
            '50 Cent',
            'Lil Wayne',
            'Rihanna',
            'Usher',
            'Shakira'
        ],
        datasets: [{
            label: '# of Votes',
            data: [
                5, /**Black Eyed Peas */
                5, /**Lady Gaga */
                9, /**Chris Brown*/
                4, /**Kelly Clarkson */
                10, /**Britney spears*/
                2, /**Far east movement*/
                2, /**Macklemore */
                30, /**Pitbull */
                2, /**50 Cent */
                2, /**Lil Wayne */
                6, /**Rihanna */
                9, /**Usher */
                3, /**Shakira */


            ],
            backgroundColor: [
                'rgba(0, 98, 255, 0.2)',
                'rgba(170, 0, 255, 0.2)',
                'rgba(255, 0, 162, 0.2)',
                'rgba(255, 0, 0, 0.2)',
                'rgba(255, 149, 0, 0.2)',
                'rgba(255, 234, 0, 0.2)',
                'rgba(174, 255, 0, 0.2)',
                'rgba(4, 255, 0, 0.2)',
                'rgba(0, 255, 179, 0.2)',
                'rgba(0, 225, 255, 0.2)',
                'rgba(0, 77, 153, 0.2)',
                'rgba(33, 0, 153, 0.2)',
            ],
            borderWidth: 0
        }]
    },
    options: {}
});
