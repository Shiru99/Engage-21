import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';

import CardContent from '@material-ui/core/CardContent';
import CardMedia from '@material-ui/core/CardMedia';
import Typography from '@material-ui/core/Typography';
import { Collapse } from '@material-ui/core';

const useStyles = makeStyles({
  root: {
    maxWidth: 500,
    background: 'rgba(0,0,0,0.5)',
    margin: '20px',
  },
  media: {
    height: 350,
    // width: 500,
  },
  title: {
    fontFamily: 'Nunito',
    fontWeight: 'bold',
    fontSize: '2rem',
    color: '#fff',
    textAlign: 'center',
    margin: '10px',
  },
  desc: {
    fontFamily: 'Nunito',
    fontSize: '1.1rem',
    color: '#ddd',
  },
});

export default function ImageCard({ activity, checked }) {
  const classes = useStyles();

  return (
    <Collapse in={checked} {...(checked ? { timeout: 1000 } : {})}>
      <Card className={classes.root}>
        <CardMedia
          className={classes.media}
          image={activity.imageUrl}
          title={activity.title}
        />
        <CardContent>
          <Typography
            gutterBottom
            variant="h5"
            component="h1"
            className={classes.title}
          >
            {activity.title}
          </Typography>
          {/* <Typography
            variant="body2"
            color="textSecondary"
            component="p"
            className={classes.desc}
          >
            {activity.description}
          </Typography> */}
        </CardContent>
      </Card>
    </Collapse>
  );
}
