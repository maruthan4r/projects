var ctx = document.getElementById('millenial-chart');
var millenial_data = [5, 5, 9, 4, 10, 2, 2, 10, 2, 2, 6, 9, 3];
console.log(
    millenial_data.reduce(function(acc, val) { return acc + val; }, 0)
);
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
            'Shakira',
            'Beyonce',
            'Other'
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
                10, /**Pitbull */
                2, /**50 Cent */
                2, /**Lil Wayne */
                6, /**Rihanna */
                9, /**Usher */
                3, /**Shakira */
                5, /**Beyonce */
                137 /**Other Artists  */


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
                'rgba(247, 3, 255, 0.2)',
                'rgba(125,125,125, 0.2)'

            ],
            borderWidth: 0
        }]
    },
    options: {}
});
