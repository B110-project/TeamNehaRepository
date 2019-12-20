import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RedashComponent } from './redash.component';

describe('RedashComponent', () => {
  let component: RedashComponent;
  let fixture: ComponentFixture<RedashComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RedashComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RedashComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
